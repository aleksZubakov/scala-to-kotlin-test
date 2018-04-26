package org.scala.checklist.checkers

import com.sun.tools.corba.se.idl.InvalidArgument
import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.nodes.atomic.{AtomicNode, DecimalConstNode, VarReferenceNode}
import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes.operations.{BooleanOpNode, ExpressionNode, LogicalOpNode}
import org.scala.checklist.ast.visitors.base.ASTVisitor
import org.scala.checklist.checkers.ScopeTableTypes.{FunctionTable, VariableTable}
import org.scala.checklist.config.VariableType
import org.scala.checklist.config.VariableType.VariableType


package object ScopeTableTypes {
  type arg = (String, VariableType)
  type FunctionSignature = List[arg]
  type FunctionTable = Map[String, FunctionSignature]

  type FunctionInfo = (FunctionSignature, BodyNode)
  type FunctionTableWithDefinition = Map[String, FunctionInfo]

  type VariableTable = Map[String, VariableType]
  type VariableTableInfo = Map[String, (VariableType, String)]
}

case class SignatureCheckerContext(functionTable: FunctionTable, variableTable: VariableTable)

class FunctionSignatureChecker extends ASTVisitor[Unit, SignatureCheckerContext] {
  override def visitTemplateNode(text: TextNode, stmts: List[ASTNode], context: SignatureCheckerContext): Unit = {
    var globalContext = context

    stmts.foreach {
      case it: FuncDefinitionNode => {
        val args = it.arguments.map {
          arg => (arg.varName, arg.varType)
        }
        val SignatureCheckerContext(funcTable, varTable) = context
        val newFuncTable = funcTable + (it.funcName -> args)
        globalContext = SignatureCheckerContext(newFuncTable, varTable)
        it.accept(this, globalContext)
      }

      case varAssign: VarAssignmentNode => {
        val varDef = varAssign.varDefinition
        val SignatureCheckerContext(funcTable, varTable) = context

        val newVariableTable = varTable + (varDef.varName -> varDef.varType)
        globalContext = SignatureCheckerContext(funcTable, newVariableTable)
      }

      case stmt => stmt.accept(this, context)

      case el => el.accept(this, globalContext)

    }

  }

  override def visitItemNode(text: List[ItemElementNode], context: SignatureCheckerContext): Unit = {
    text.foreach(_.accept(this, context))
  }

  override def visitIfNode(condition: BooleanOpNode, bodyNode: BodyNode, context: SignatureCheckerContext): Unit = {
    condition.accept(this, context)
    bodyNode.accept(this, context)
  }

  override def visitTextNode(text: String, context: SignatureCheckerContext): Unit = {
  }

  override def visitBodyNode(items: List[ASTNode], context: SignatureCheckerContext): Unit = {

    var globalContext = context

    items.foreach {
      case it: FuncDefinitionNode => {
        val args = it.arguments.map {
          arg => (arg.varName, arg.varType)
        }
        val SignatureCheckerContext(funcTable, varTable) = context
        val newFuncTable = funcTable + (it.funcName -> args)
        globalContext = SignatureCheckerContext(newFuncTable, varTable)
        it.accept(this, globalContext)
      }
      case el => el.accept(this, globalContext)
    }
  }

  override def visitVarReferenceNode(name: String, context: SignatureCheckerContext): Unit = {
  }

  override def visitDecimalConstNode(value: String, context: SignatureCheckerContext): Unit = {
  }

  override def visitLogicalOpNode(left: LogicalOpNode, op: LogicalOperation,
                                  right: LogicalOpNode, context: SignatureCheckerContext): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitCompareOpNode(left: ExpressionNode, op: CompareOperation,
                                  right: ExpressionNode, context: SignatureCheckerContext): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitNotOpNode(expr: LogicalOpNode, context: SignatureCheckerContext): Unit = {
    expr.accept(this, context)
  }

  override def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation,
                                     right: ExpressionNode, context: SignatureCheckerContext): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitNegationOpNode(expr: ExpressionNode, context: SignatureCheckerContext): Unit = {
    expr.accept(this, context)
  }

  override def visitFuncDefinitionNode(funcName: String, arguments: List[VarDefinitionNode],
                                       body: BodyNode, context: SignatureCheckerContext): Unit = {

    body.accept(this, context)

  }

  override def visitPlaceHolderNode(expr: ExpressionNode, context: SignatureCheckerContext): Unit = {
    expr.accept(this, context)
  }

  override def visitFuncCallNode(funcReference: String, args: List[AtomicNode],
                                 context: SignatureCheckerContext): Unit = {
    val SignatureCheckerContext(functionTable, variableTable) = context
    if (!functionTable.contains(funcReference)) return


    val functionSignature = functionTable(funcReference).map(_._2)
    val argsTypes = args.map {
      case _: DecimalConstNode => VariableType.Numeric
      case varRef: VarReferenceNode => variableTable.getOrElse(varRef.name, VariableType.Null)
    }
    if (functionSignature != argsTypes) {
      throw new InvalidArgument("Whoops cannot call")
    }
  }

  override def visitVarAssignment(varDefinition: VarDefinitionNode, value: AtomicNode,
                                  context: SignatureCheckerContext): Unit = {
  }
}