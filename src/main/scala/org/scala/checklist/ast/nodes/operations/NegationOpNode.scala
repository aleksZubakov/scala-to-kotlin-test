package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.visitors.base.ASTVisitor

class NegationOpNode(val expressionNode: ExpressionNode) extends ExpressionNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitNegationOpNode(expressionNode)
}
