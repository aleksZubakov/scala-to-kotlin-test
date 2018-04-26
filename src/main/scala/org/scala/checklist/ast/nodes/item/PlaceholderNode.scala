package org.scala.checklist.ast.nodes.item

import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.visitors.base.ASTVisitor

class PlaceholderNode(val expr: ExpressionNode) extends ItemElementNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T =
    visitor.visitPlaceHolderNode(expr, context)

}
