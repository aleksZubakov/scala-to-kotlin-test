package org.scala.checklist.ast.nodes.atomic

import org.scala.checklist.ast.visitors.base.ASTVisitor

class VarNode(val name: String) extends AtomicNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitVarNode(name)
}
