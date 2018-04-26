package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.visitors.base.ASTVisitor

class NegationOpNode(val expressionNode: ExpressionNode) extends ExpressionNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitNegationOpNode(expressionNode, context)
}
