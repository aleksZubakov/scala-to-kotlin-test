package org.scala.checklist.ast.nodes.item

import org.scala.checklist.ast.visitors.base.ASTVisitor

class TextNode(val text: String) extends ItemElementNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitTextNode(text)
}
