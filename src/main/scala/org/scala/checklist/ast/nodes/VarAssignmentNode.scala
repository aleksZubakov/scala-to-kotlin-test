package org.scala.checklist.ast.nodes
import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.visitors.base.ASTVisitor

class VarAssignmentNode(val varDefinition: VarDefinitionNode, val value: AtomicNode) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = ???
}
