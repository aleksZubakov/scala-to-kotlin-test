package org.scala.checklist.exceptions

case class TypeCheckException(smth: String) extends Exception

case class NotFoundDeclarationException(msg: String, varName: String) extends Exception

case class InvalidFunctionCall(msg: String) extends Exception

case class ConfigParseException(msg: String) extends Exception
