package org.scala.checklist.typechecker

import com.sun.tools.corba.se.idl.InvalidArgument
import org.scala.checklist.ast.nodes.atomic.{AtomicNode, DecimalConstNode, VarReferenceNode}
import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.visitors.base.ASTVisitor
import org.scala.checklist.config.VariableType
import org.scala.checklist.config.VariableType.VariableType
import org.scala.checklist.typechecker.ScopeTableTypes.{FunctionSignature, FunctionTable, VariableTable}


package object ScopeTableTypes {
  type arg = (String, VariableType)
  type FunctionSignature = List[arg]
  type FunctionTable = Map[String, FunctionSignature]
  type VariableTable = Map[String, VariableType]
}

case class Context(functionTable: FunctionTable, variableTable: VariableTable)

object FunctionSignatureChecker extends ASTVisitor[Unit, Context] {
  override def visitTemplateNode(text: TextNode, stmts: List[ASTNode], context: Context): Unit = {
    var globalContext = context

    stmts.foreach{
      case it: FuncDefinitionNode => {
        val args = it.arguments.map {
          arg => (arg.varName, arg.varType)
        }
        val Context(funcTable, varTable) = context
        val newFuncTable = funcTable + (it.funcName -> args)
        globalContext = Context(newFuncTable, varTable)
        it.accept(this, globalContext)
      }
      case el => el.accept(this, globalContext)
    }
  }

  override def visitItemNode(text: List[ItemElementNode], context: Context): Unit = {
    text.foreach(_.accept(this, context))
  }

  override def visitIfNode(condition: ExpressionNode, bodyNode: BodyNode, context: Context): Unit = {
    condition.accept(this, context)
    bodyNode.accept(this, context)
  }

  override def visitTextNode(text: String, context: Context): Unit = {}

  override def visitBodyNode(items: List[ASTNode], context: Context): Unit = {

    var globalContext = context

    items.foreach{
      case it: FuncDefinitionNode => {
        val args = it.arguments.map {
          arg => (arg.varName, arg.varType)
        }
        val Context(funcTable, varTable) = context
        val newFuncTable = funcTable + (it.funcName -> args)
        globalContext = Context(newFuncTable, varTable)
        it.accept(this, globalContext)
      }
      case el => el.accept(this, globalContext)
    }
  }

  override def visitVarReferenceNode(name: String, context: Context): Unit = {}

  override def visitDecimalConstNode(value: Double, context: Context): Unit = {}

  override def visitLogicalOpNode(left: ExpressionNode, op: LogicalOperation,
                                  right: ExpressionNode, context: Context): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitCompareOpNode(left: ExpressionNode, op: CompareOperation,
                                  right: ExpressionNode, context: Context): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitNotOpNode(expr: ExpressionNode, context: Context): Unit = {
    expr.accept(this, context)
  }

  override def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation,
                                     right: ExpressionNode, context: Context): Unit = {
    left.accept(this, context)
    right.accept(this, context)
  }

  override def visitNegationOpNode(expr: ExpressionNode, context: Context): Unit = {
    expr.accept(this, context)
  }

  override def visitFuncDefinitionNode(funcName: String, arguments: List[VarDefinitionNode],
                                       body: BodyNode, context: Context): Unit = {

    body.accept(this, context)

  }

  override def visitPlaceHolderNode(expr: ExpressionNode, context: Context): Unit = {
    expr.accept(this, context)
  }

  override def visitFuncCallNode(funcReference: String, args: List[AtomicNode],
                                 context: Context): Unit = {
    val Context(functionTable, variableTable) = context
    if (!functionTable.contains(funcReference)) return


    val functionSignature = functionTable(funcReference)
    val argsTypes = args.map{
      case _: DecimalConstNode => VariableType.Numeric
      case varRef: VarReferenceNode => variableTable.getOrElse(varRef.name, VariableType.Null)
    }
    if (functionSignature != argsTypes) {
      throw new InvalidArgument("Whoops cannot call")
    }
  }
}