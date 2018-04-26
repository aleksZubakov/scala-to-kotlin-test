package org.scala.checklist.checkers

import com.sun.tools.corba.se.idl.InvalidArgument
import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes.operations.{BooleanOpNode, ExpressionNode, LogicalOpNode}
import org.scala.checklist.ast.nodes.{ASTNode, BodyNode, VarAssignmentNode, VarDefinitionNode}
import org.scala.checklist.ast.visitors.ASTVisitor
import org.scala.checklist.exceptions.NotFoundDeclarationException

class AllVariablesDeclaredChecker extends ASTVisitor[Unit, Set[String]] {
  override def visitTemplateNode(text: TextNode, stmts: List[ASTNode], context: Set[String]): Unit = {
    var globalContext = context
    stmts.foreach {
      case varAssign: VarAssignmentNode => {
        val varDef = varAssign.varDefinition
        globalContext += varDef.varName
      }
      case stmt => stmt.accept(this, context)
    }
  }

  override def visitItemNode(text: List[ItemElementNode], context: Set[String]): Unit = {
    text.foreach(_.accept(this, context))
  }

  override def visitIfNode(condition: BooleanOpNode, bodyNode: BodyNode, context: Set[String]): Unit = {
    condition.accept(this, context)
    bodyNode.accept(this, context)
  }

  override def visitTextNode(text: String, context: Set[String]): Unit = {}

  override def visitBodyNode(items: List[ASTNode], context: Set[String]): Unit = {
    items.foreach(_.accept(this, context))
  }

  override def visitVarReferenceNode(name: String, context: Set[String]): Unit = {
    if (!context.contains(name)) {
      throw NotFoundDeclarationException(s"can't found declaration of variable $name", name)
    }
  }

  override def visitDecimalConstNode(value: String, context: Set[String]): Unit = {}

  override def visitLogicalOpNode(left: LogicalOpNode, op: LogicalOperation,
                                  right: LogicalOpNode, context: Set[String]): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitCompareOpNode(left: ExpressionNode, op: CompareOperation,
                                  right: ExpressionNode, context: Set[String]): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitNotOpNode(expr: LogicalOpNode, context: Set[String]): Unit = {
    expr.accept(this, context)
  }

  override def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation,
                                     right: ExpressionNode, context: Set[String]): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitNegationOpNode(expr: ExpressionNode, context: Set[String]): Unit = {
    expr.accept(this, context)
  }

  override def visitFuncDefinitionNode(funcName: String, arguments: List[VarDefinitionNode], body: BodyNode, context: Set[String]): Unit = {
    val expContext = arguments.map(
      curVar => curVar.varName
    ).toSet

    body.accept(this, context ++ expContext)
  }

  override def visitPlaceHolderNode(expr: ExpressionNode, context: Set[String]): Unit = {
    expr.accept(this, context)
  }

  override def visitFuncCallNode(funcReference: String, args: List[AtomicNode], context: Set[String]): Unit = {
    args.foreach(_.accept(this, context))
  }

  override def visitVarAssignment(varDefinition: VarDefinitionNode,
                                  value: ExpressionNode, context: Set[String]): Unit = {
    value.accept(this, context)
  }
}
