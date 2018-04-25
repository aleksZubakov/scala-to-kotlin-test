package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.visitors.ASTVisitor

class NotOpNode(val expr: ExpressionNode) extends ExpressionNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitNotOpNode(expr)
}
