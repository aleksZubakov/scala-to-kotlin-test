package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.nodes.item.TextNode
import org.scala.checklist.ast.visitors.ASTVisitor

class TemplateNode(val text: TextNode, val stmts: List[ASTNode]) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitTemplateNode(text, stmts, context)

}
