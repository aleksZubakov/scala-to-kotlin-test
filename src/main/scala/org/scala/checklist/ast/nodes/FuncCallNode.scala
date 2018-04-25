package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.visitors.base.ASTVisitor

class FuncCallNode(val funcReference: String,
                   val args: List[AtomicNode]) extends ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = ???
}
