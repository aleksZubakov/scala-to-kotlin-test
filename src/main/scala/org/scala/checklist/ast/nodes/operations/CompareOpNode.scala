package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.visitors.base.ASTVisitor

class CompareOpNode(val left: ExpressionNode, val cmp: CompareOperation, val right: ExpressionNode) extends ExpressionNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitCompareOpNode(left, cmp, right)
}
