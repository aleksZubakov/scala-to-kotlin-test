package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.visitors.ASTVisitor

class NotOpNode(val expr: LogicalOpNode) extends ExpressionNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitNotOpNode(expr, context)
}
