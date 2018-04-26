package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.item.ItemElementNode
import org.scala.checklist.ast.visitors.base.ASTVisitor

class FuncCallNode(val funcReference: String,
                   val args: List[AtomicNode]) extends ASTNode with ItemElementNode{
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T =
    visitor.visitFuncCallNode(funcReference, args, context)
}
