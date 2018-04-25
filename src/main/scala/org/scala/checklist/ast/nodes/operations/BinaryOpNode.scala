package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.nodes.BinaryOperation.BinaryOperation
import org.scala.checklist.ast.nodes.ExpressionNode
import org.scala.checklist.ast.visitors.ASTVisitor

class BinaryOpNode(val left: ExpressionNode, val op: BinaryOperation, val right: ExpressionNode) extends ExpressionNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitBinaryOpNode(left, op, right)
}
