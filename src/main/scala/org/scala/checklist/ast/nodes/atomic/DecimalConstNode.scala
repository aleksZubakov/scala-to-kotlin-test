package org.scala.checklist.ast.nodes.atomic

import org.scala.checklist.ast.visitors.base.ASTVisitor

class DecimalConstNode(val value: Double) extends AtomicNode {
  override def accept[T](visitor: ASTVisitor[T]): T = visitor.visitDecimalConstNode(value)
}
