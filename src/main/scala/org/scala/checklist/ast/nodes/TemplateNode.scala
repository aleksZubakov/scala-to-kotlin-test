package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.base.ASTVisitor

class TemplateNode(val text: TextNode, val stmts: List[ASTNode]) extends ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = {
    visitor.visitTemplateNode(text, stmts)
  }
}
