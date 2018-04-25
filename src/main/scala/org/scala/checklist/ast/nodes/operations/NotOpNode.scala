package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.visitors.base.ASTVisitor

class NotOpNode(val expr: ExpressionNode) extends ExpressionNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitNotOpNode(expr)
}
