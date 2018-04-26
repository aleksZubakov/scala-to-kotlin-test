package org.scala.checklist.ast.nodes.item

import org.scala.checklist.ast.visitors.ASTVisitor

class TextNode(val text: String) extends ItemElementNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitTextNode(text, context)
}
