package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.ASTVisitor

class ItemNode(val text: List[TextNode]) extends ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = {
    visitor.visitItemNode(text)
  }
}
