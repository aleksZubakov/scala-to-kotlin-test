package org.scala.checklist.ast.nodes.item

import org.scala.checklist.ast.nodes.ASTNode
import org.scala.checklist.ast.visitors.base.ASTVisitor



class ItemNode(val text: List[ItemElementNode]) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitItemNode(text, context)

}
