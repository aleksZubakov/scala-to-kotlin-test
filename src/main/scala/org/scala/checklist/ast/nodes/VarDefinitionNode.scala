package org.scala.checklist.ast.nodes
import org.scala.checklist.ast.visitors.ASTVisitor
import org.scala.checklist.ast.nodes.atomic.VariableType.VariableType

class VarDefinitionNode(val description: String, val varName: String, val varType: VariableType) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = ???
}
