package org.scala.checklist.checkers

import com.sun.tools.corba.se.idl.InvalidArgument
import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes.operations._
import org.scala.checklist.ast.visitors.ASTVisitor
import org.scala.checklist.config.VariableType
import org.scala.checklist.config.VariableType.VariableType


class SimpleTypeChecker extends ASTVisitor[VariableType, Map[String, VariableType]] {


  override def visitTemplateNode(text: TextNode, stmts: List[ASTNode],
                                 context: Map[String, VariableType]): VariableType = {
    var globalContext = context
    stmts.foreach {
      case varAssign: VarAssignmentNode => {
        val varDef = varAssign.varDefinition
        globalContext += varDef.varName -> varDef.varType
      }

      case stmt => stmt.accept(this, context)
    }

    VariableType.Null
  }

  override def visitItemNode(text: List[ItemElementNode], context: Map[String, VariableType]): VariableType = {
    text.foreach(_.accept(this, context))
    VariableType.Null
  }

  override def visitIfNode(condition: BooleanOpNode, bodyNode: BodyNode,
                           context: Map[String, VariableType]): VariableType = {
    condition.accept(this, context)
    bodyNode.accept(this, context)
    VariableType.Null
  }

  override def visitTextNode(text: String,
                             context: Map[String, VariableType]): VariableType = {
    VariableType.Null
  }

  override def visitBodyNode(items: List[ASTNode],
                             context: Map[String, VariableType]): VariableType = {
    items.foreach(_.accept(this, context))
    VariableType.Null
  }

  override def visitVarReferenceNode(name: String,
                                     context: Map[String, VariableType]): VariableType = {
    context.getOrElse(name, VariableType.Null)
  }

  override def visitDecimalConstNode(value: String, context: Map[String, VariableType]): VariableType = {
    VariableType.Numeric
  }

  override def visitLogicalOpNode(left: LogicalOpNode, op: LogicalOperation,
                                  right: LogicalOpNode, context: Map[String, VariableType]): VariableType = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitCompareOpNode(left: ExpressionNode, op: CompareOperation,
                                  right: ExpressionNode, context: Map[String, VariableType]): VariableType = {
    val leftType = left.accept(this, context)
    val rightType = right.accept(this, context)

    if (leftType != rightType) {
      throw new InvalidArgument("oop") // TODO NORMAL EXCEPTION
    }
    leftType
  }

  override def visitNotOpNode(expr: LogicalOpNode, context: Map[String, VariableType]): VariableType = {
    expr.accept(this, context)
  }

  override def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation,
                                     right: ExpressionNode, context: Map[String, VariableType]): VariableType = {
    val leftType = left.accept(this, context)
    val rightType = right.accept(this, context)

    if (leftType == VariableType.String
      || rightType == VariableType.String
      || leftType != rightType) { // TODO?
      throw new InvalidArgument("oop") // TODO NORMAL EXCEPTION
    }
    leftType
  }

  override def visitNegationOpNode(expr: ExpressionNode, context: Map[String, VariableType]): VariableType = {
    expr.accept(this, context)
  }


  override def visitFuncDefinitionNode(funcName: String, arguments: List[VarDefinitionNode],
                                       body: BodyNode, context: Map[String, VariableType]): VariableType = {

    val expContext = arguments.map(
      curVar => curVar.varName -> curVar.varType
    ).toMap

    body.accept(this, context ++ expContext)
  }

  override def visitPlaceHolderNode(expr: ExpressionNode, context: Map[String, VariableType]): VariableType = {
    expr.accept(this, context)
  }

  override def visitFuncCallNode(funcReference: String, args: List[AtomicNode],
                                 context: Map[String, VariableType]): VariableType = {
    VariableType.Null
  }

  override def visitVarAssignment(varDefinition: VarDefinitionNode, value: ExpressionNode,
                                  context: Map[String, VariableType]): VariableType = {
    VariableType.Null
  }
}


