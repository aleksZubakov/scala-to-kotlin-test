package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.base.ASTVisitor

trait ASTNode {
  def accept[T, G](visitor: ASTVisitor[T, G], context: G): T
}
