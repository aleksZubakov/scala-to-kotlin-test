package org.scala.checklist.app

import org.antlr.generated._
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.scala.checklist.ast.visitors.base.{InterpretContext, InterpretVisitor}
import org.scala.checklist.config.{Config, ConfigEntry}
import org.scala.checklist.checkers.{FunctionSignatureChecker, SignatureCheckerContext, SimpleTypeChecker}
import org.scala.checklist.visitors.antlr.AstTransformer

object Interpreter {
  def run(templateFileName: String, configFileName: String): Unit = {
    val lexer = new CheckListLexer(CharStreams.fromFileName("test.checklist"))
    val tokenStream = new CommonTokenStream(lexer)
    val parser = new CheckListParser(tokenStream)

    val templateAst = parser.template().accept(new AstTransformer)

    val config = Config.buildFromFile("test.config")

    val context = config.variables.map {
      case (key: String, entry: ConfigEntry) => key -> entry.varType
    }

    templateAst.accept(new SimpleTypeChecker, context)
    templateAst.accept(new FunctionSignatureChecker, SignatureCheckerContext(Map.empty, context))

    val fullContext = config.variables.map {
      case (key: String, entry: ConfigEntry) => key -> (entry.varType, entry.value)
    }
    templateAst.accept(new InterpretVisitor, InterpretContext(0, Map.empty, fullContext))
  }
}

object MyMain extends App {
    Interpreter.run("test.checklist", "test.config")



}