package org.scala.checklist.ast.nodes.atomic

object VariableType extends Enumeration {
  type VariableType = Value
  val Numeric, String, Null = Value
}
