package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.ASTVisitor

class BodyNode(val items: List[ASTNode]) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitBodyNode(items, context)

}
