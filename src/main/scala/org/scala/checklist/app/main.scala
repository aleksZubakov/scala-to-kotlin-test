package org.scala.checklist.app

import org.antlr.generated._
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.scala.checklist.config.{Config, ConfigEntry}
import org.scala.checklist.typechecker.SimpleTypeChecker
import org.scala.checklist.visitors.antlr.AstTransformer

object MyMain extends App {
  val lexer = new CheckListLexer(CharStreams.fromFileName("test.checklist"))
  val tokenStream = new CommonTokenStream(lexer)
  val parser = new CheckListParser(tokenStream)

  val templateAst = parser.template().accept(new AstTransformer)

  val config = Config.buildFromFile("test.config")

  val context = config.variables.map {
    case (key: String, entry: ConfigEntry) => key -> entry.varType
  }

  SimpleTypeChecker.checkTypes(templateAst, context)


  //  templateAst.accept(new TypeAndConfigCheckListener(config))

}