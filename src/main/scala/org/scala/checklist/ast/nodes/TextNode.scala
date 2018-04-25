package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.base.ASTVisitor

class TextNode(val text: String) extends ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = {
    visitor.visitTextNode(text)
  }

}
