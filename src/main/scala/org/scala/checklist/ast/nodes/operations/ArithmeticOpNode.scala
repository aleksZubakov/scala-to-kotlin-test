package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.visitors.base.ASTVisitor

class ArithmeticOpNode(val left: ExpressionNode, val op: ArithmeticOperation, val right: ExpressionNode) extends ExpressionNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitArithmeticOpNode(left, op, right, context)
}
