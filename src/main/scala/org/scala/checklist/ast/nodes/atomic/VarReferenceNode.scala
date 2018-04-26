package org.scala.checklist.ast.nodes.atomic

import org.scala.checklist.ast.visitors.base.ASTVisitor

class VarReferenceNode(val name: String) extends AtomicNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitVarReferenceNode(name, context)
}
