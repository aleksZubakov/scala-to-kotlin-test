package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.ASTVisitor

class PlaceholderNode(text: String) extends TextNode(text) with ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = {
    visitor.visitTextNode(text)
  }

}
