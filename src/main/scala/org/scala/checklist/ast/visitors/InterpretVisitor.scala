package org.scala.checklist.ast.visitors

import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.nodes.atomic.{AtomicNode, DecimalConstNode, VarReferenceNode}
import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes.operations._
import org.scala.checklist.checkers.ScopeTableTypes.{FunctionTableWithDefinition, VariableTableInfo}
import org.scala.checklist.ast.nodes.atomic.VariableType.VariableType


case class InterpretContext(howManySpaces: Int, functionTable: FunctionTableWithDefinition,
                            variableTable: VariableTableInfo)


class InterpretVisitor extends ASTVisitor[Unit, InterpretContext] {


  override def visitTemplateNode(text: TextNode, stmts: List[ASTNode], context: InterpretContext): Unit = {
    println(s"ЗАГОЛОВОК: ${text.text}")

    var globalContext = context

    stmts.foreach {
      case it: FuncDefinitionNode => {
        val args = it.arguments.map {
          arg => (arg.varName, arg.varType)
        }
        val InterpretContext(howManySpaces, funcTable, varTable) = globalContext
        val newFuncTable = funcTable + (it.funcName -> (args, it.body))
        globalContext = InterpretContext(howManySpaces, newFuncTable, varTable)
        it.accept(this, globalContext)
      }

      case varAssign: VarAssignmentNode => {
        val varDef = varAssign.varDefinition
        val InterpretContext(spaces, funcTable, varTable) = globalContext

        val value = unpackFromExpression(varAssign.value, globalContext)
        val newVariableTable = varTable + (varDef.varName -> (varDef.varType, value))
        globalContext = InterpretContext(spaces, funcTable, newVariableTable)

        print(s"${varDef.description} : $value")
      }

      case stmt => stmt.accept(this, globalContext)
    }

  }

  override def visitItemNode(text: List[ItemElementNode], context: InterpretContext): Unit = {
    text.foreach(_.accept(this, context))
    println()
  }

  override def visitIfNode(condition: BooleanOpNode, bodyNode: BodyNode, context: InterpretContext): Unit = {
    if (evaluateLogicalExpression(condition, context)) {
      bodyNode.accept(this, context)
    }
  }

  override def visitTextNode(text: String, context: InterpretContext): Unit = {
    print(text)
  }

  override def visitBodyNode(items: List[ASTNode], context: InterpretContext): Unit = {
    items.foreach(_.accept(this, context))
  }

  override def visitFuncDefinitionNode(funcName: String, arguments: List[VarDefinitionNode],
                                       body: BodyNode, context: InterpretContext): Unit = {}

  override def visitPlaceHolderNode(expr: ExpressionNode, context: InterpretContext): Unit = {
    val InterpretContext(_, _, variableTable) = context

    expr match {
      case varRef: VarReferenceNode => {
        val varName = varRef.name
        val (_, value) = variableTable(varName)
        print(value)
      }
      case arithm: ArithmeticOpNode => {
        val res = evaluateArithmeticExpression(arithm, context)
        print(res)
      }
      case exp => exp.accept(this, context)
    }
  }

  override def visitFuncCallNode(funcReference: String, args: List[AtomicNode],
                                 context: InterpretContext): Unit = {
    val InterpretContext(howManySpaces, functionTable, variableTable) = context
    if (!functionTable.contains(funcReference)) return


    val (funcSignature, funcBody) = functionTable(funcReference)
    val argNames = funcSignature
    val values = args.map(unpackFromExpression(_, context))

    val newVariables = argNames.zip(values).map {
      case ((name: String, varType: VariableType), value: String) => {
        name -> (varType, value)
      }
    }

    funcBody.accept(this, InterpretContext(howManySpaces, functionTable, variableTable ++ newVariables))

  }

  def evaluateLogicalExpression(expr: BooleanOpNode, context: InterpretContext): Boolean = {
    expr match {
      case logical: LogicalOpNode => {
        val op = logical.op
        val leftRes = evaluateLogicalExpression(logical.left, context)
        val rightRes = evaluateLogicalExpression(logical.right, context)
        op match {
          case LogicalOperation.AND => {
            leftRes && rightRes
          }
          case LogicalOperation.OR => {
            leftRes || rightRes
          }
        }
      }
      case compare: CompareOpNode => {
        val op = compare.cmp
        val leftRes = evaluateExpression(compare.left, context)
        val rightRes = evaluateExpression(compare.right, context)

        op match {
          case CompareOperation.LE => {
            leftRes <= rightRes
          }
          case CompareOperation.LT => {
            leftRes < rightRes
          }
          case CompareOperation.GE => {
            leftRes >= rightRes
          }
          case CompareOperation.GT => {
            leftRes > rightRes
          }
          case CompareOperation.EQ => {
            leftRes == rightRes
          }
        }
      }

      case not: NotOpNode => {
        !evaluateLogicalExpression(not.expr, context)
      }

    }
  }

  def unpackFromExpression(expr: ExpressionNode, context: InterpretContext): String = expr match {
    case dec: DecimalConstNode => dec.value
    case varRef: VarReferenceNode => {
      val InterpretContext(_, _, variableTable) = context
      variableTable(varRef.name)._2
    }
    case arithm: ArithmeticOpNode => {
      val value = evaluateArithmeticExpression(arithm, context)
      value.toString
    }

  }

  def evaluateArithmeticExpression(expr: ArithmeticOpNode, context: InterpretContext): Double = {
    val op = expr.op
    val leftExpr = evaluateExpression(expr.left, context)
    val rightExpr = evaluateExpression(expr.right, context)
    op match {
      case ArithmeticOperation.MULT => leftExpr * rightExpr
      case ArithmeticOperation.DIV => leftExpr / rightExpr
      case ArithmeticOperation.PLUS => leftExpr + rightExpr
      case ArithmeticOperation.MINUS => leftExpr - rightExpr
    }
  }

  def evaluateExpression(expr: ExpressionNode, context: InterpretContext): Double = {
    val InterpretContext(_, _, variableTable) = context

    expr match {
      case varRef: VarReferenceNode => {
        val value = variableTable(varRef.name)._2

        try {
          value.toDouble
        } catch {
          case e: NumberFormatException => value.hashCode.toDouble
        }

      }
      case decim: DecimalConstNode => {
        decim.value.toDouble
      }
      case arithm: ArithmeticOpNode => {
        evaluateArithmeticExpression(arithm, context)
      }
    }
  }



  override def visitVarReferenceNode(name: String, context: InterpretContext): Unit = ???

  override def visitDecimalConstNode(value: String, context: InterpretContext): Unit = ???

  override def visitLogicalOpNode(left: LogicalOpNode, op: LogicalOperation,
                                  right: LogicalOpNode, context: InterpretContext): Unit = ???

  override def visitCompareOpNode(left: ExpressionNode, op: CompareOperation,
                                  right: ExpressionNode, context: InterpretContext): Unit = ???

  override def visitNotOpNode(expr: LogicalOpNode, context: InterpretContext): Unit = ???

  override def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation, right: ExpressionNode, context: InterpretContext): Unit = ???

  override def visitNegationOpNode(expr: ExpressionNode, context: InterpretContext): Unit = ???

  override def visitVarAssignment(varDefinition: VarDefinitionNode, value: ExpressionNode,
                                  context: InterpretContext): Unit = ???
}
