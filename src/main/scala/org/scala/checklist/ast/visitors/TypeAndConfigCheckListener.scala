//package org.scala.checklist.ast.visitors
//
//import com.sun.tools.corba.se.idl.InvalidArgument
//import org.scala.checklist.ast.nodes.atomic.{DecimalConstNode, VarReferenceNode}
//import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
//import org.scala.checklist.ast.nodes.operations.{CompareOperation, ExpressionNode}
//import org.scala.checklist.ast.visitors.base.BaseListener
//import org.scala.checklist.config.{Config, VariableType}
//
//class TypeAndConfigCheckListener(val config: Config) extends BaseListener {
//  override def visitVarNode(name: String): Unit = {
//    if (!config.variables.contains(name)) {
//      throw new InvalidArgument("visitVarNode") // TODO normal exception
//    }
//    super.visitVarNode(name)
//  }
//
//  override def visitCompareOpNode(left: ExpressionNode, op: CompareOperation, right: ExpressionNode): Unit = {
//    left.accept(this)
//    right.accept(this)
//
//    (left, right) match {
//      case (leftNode: VarReferenceNode, rightNode: VarReferenceNode) if op != CompareOperation.EQ => {
//        val leftType = config.variables(leftNode.name).varType
//        val rightType = config.variables(rightNode.name).varType
//
//
//        if (leftType == VariableType.String && rightType == VariableType.String) {
//          throw new InvalidArgument("visitCompareOpNode") // TODO normal exception
//        }
//      }
//
//      case (_: DecimalConstNode, rightNode: VarReferenceNode) => {
//        val rightType = config.variables(rightNode.name).varType
//        if (rightType == VariableType.String) {
//          throw new InvalidArgument("visitCompareOpNode") // TODO normal exception
//        }
//      }
//
//      case (leftNode: VarReferenceNode, _: DecimalConstNode) => {
//        val leftType = config.variables(leftNode.name).varType
//        if (leftType == VariableType.String) {
//          throw new InvalidArgument() // TODO normal exception
//        }
//      }
//      case (_, _) =>
//    }
//  }
//
//}
