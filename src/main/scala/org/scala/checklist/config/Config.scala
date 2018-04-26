package org.scala.checklist.config

import org.scala.checklist.ast.nodes.atomic.VariableType
import org.scala.checklist.ast.nodes.atomic.VariableType.VariableType
import org.scala.checklist.exceptions.ConfigParseException


case class ConfigEntry(varType: VariableType,
                       value: String)

class Config private(val variables: Map[String, ConfigEntry])


object Config {
  def buildFromFile(fileName: String): Config = {
    val source = io.Source.fromFile(fileName)
    val configEntries = collection.mutable.Map.empty[String, ConfigEntry]

    for (line <- source.getLines) {
      val cols = line.split(':').map(_.trim)

      val varName = cols(0)


      val varType = parseVarType(cols(1))
      val varValue = if (cols.length < 3) {
        varName
      } else {
        cols(2)
      }

      configEntries += varName -> ConfigEntry(varType, varValue)
    }
    new Config(configEntries.toMap)
  }

  private def parseVarType(varType: String): VariableType = {
    varType match {
      case "число" => VariableType.Numeric
      case "строка" => VariableType.String
      case _ => {
        throw ConfigParseException(s"Can't parse type ${varType} from config")
      }
    }
  }
}
