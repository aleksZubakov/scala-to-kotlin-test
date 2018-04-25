package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.base.ASTVisitor

class BodyNode(val items: List[ASTNode]) extends ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitBodyNode(items)

}
