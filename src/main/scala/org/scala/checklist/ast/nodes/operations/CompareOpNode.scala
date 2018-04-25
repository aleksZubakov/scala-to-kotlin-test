package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.nodes.ExpressionNode
import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.visitors.ASTVisitor

class CompareOpNode(left: AtomicNode, cmp: CompareOperation, right: AtomicNode) extends ExpressionNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitCompareOpNode(left, cmp, right)
}
