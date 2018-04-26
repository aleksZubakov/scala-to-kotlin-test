package org.scala.checklist.ast.nodes
import org.scala.checklist.ast.visitors.base.ASTVisitor
import org.scala.checklist.config.VariableType.VariableType

class VarDefinitionNode(val description: String, val varName: String, val varType: VariableType) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = ???
}
