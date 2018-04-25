package org.scala.checklist.typechecker

import com.sun.tools.corba.se.idl.InvalidArgument
import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.nodes.atomic.{DecimalConstNode, VarReferenceNode}
import org.scala.checklist.ast.nodes.item.PlaceholderNode
import org.scala.checklist.ast.nodes.operations._
import org.scala.checklist.config.VariableType
import org.scala.checklist.config.VariableType.VariableType


object SimpleTypeChecker {
  def checkTypes(root: ASTNode, context: Map[String, VariableType]): VariableType = {
    var globalContext = context
    root match {
      case templNode: TemplateNode => {
        templNode.stmts.foreach {
          case varAssign: VarAssignmentNode => {
            val varDef = varAssign.varDefinition
            globalContext += varDef.varName -> varDef.varType
          }

          case stmt => checkTypes(stmt, context)
        }

        VariableType.Null
      }
      case ifNode: IfNode => {
        checkTypes(ifNode.condition, context)
        checkTypes(ifNode.bodyNode, context)
        VariableType.Null
      }
      case bodyNode: BodyNode => {
        bodyNode.items.foreach(checkTypes(_, context))
        VariableType.Null
      }
      case varNode: VarReferenceNode => {
        context.getOrElse(varNode.name, VariableType.Null)
      }
      case _: DecimalConstNode => {
        VariableType.Numeric
      }
      case binaryOpNode: LogicalOpNode => {
        checkTypes(binaryOpNode.left, context)
        checkTypes(binaryOpNode.right, context)
      }
      case compareOpNode: CompareOpNode => {
        val leftType = checkTypes(compareOpNode.left, context)
        val rightType = checkTypes(compareOpNode.right, context)

        if (leftType != rightType) {
          throw new InvalidArgument("oop") // TODO NORMAL EXCEPTION
        }
        leftType
      }
      case notOpNode: NotOpNode => {
        checkTypes(notOpNode.expr, context)
      }
      case arithmeticOpNode: ArithmeticOpNode => {
        val leftType = checkTypes(arithmeticOpNode.left, context)
        val rightType = checkTypes(arithmeticOpNode.right, context)

        if (leftType == VariableType.String
          || rightType == VariableType.String
          || leftType != rightType) {
          throw new InvalidArgument("oop") // TODO NORMAL EXCEPTION
        }
        leftType
      }
      case negationOpNode: NegationOpNode => {
        checkTypes(negationOpNode.expressionNode, context)
      }

      case plcHolder: PlaceholderNode => {
        checkTypes(plcHolder.expr, context)
      }
      case funcDef: FuncDefinitionNode => {
        val expContext = funcDef.arguments.map(
          curVar => curVar.varName -> curVar.varType
        ).toMap

        checkTypes(funcDef.body, globalContext ++ expContext)
      }

      case _ => {
        VariableType.Null
      }
    }


  }
}


