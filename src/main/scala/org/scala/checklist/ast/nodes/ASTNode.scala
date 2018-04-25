package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.ASTVisitor

trait ASTNode {
  def accept[T](visitor: ASTVisitor[T]): T
}
