package util

import model.Component
import model.DifficultyLevel

object Constants {
  val level = Map(DifficultyLevel.HARD -> 
                    Map(Component.SNAKE->18, Component.LADDER ->5),
                  DifficultyLevel.MEDIUM -> 
                    Map(Component.SNAKE->12, Component.LADDER ->11),
                  DifficultyLevel.EASY -> 
                    Map(Component.SNAKE->110, Component.LADDER ->13)
                  )
 val ROWS = 10
 val COLUMNS = 10
 
}