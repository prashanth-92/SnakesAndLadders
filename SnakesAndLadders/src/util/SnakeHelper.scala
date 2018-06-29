package util

import model.DifficultyLevel.DifficultyLevel
import model.Component

object SnakeHelper {
  def getNumberofSnakes(level: DifficultyLevel): Int = {
	  Helper.getRandomNumber(Constants.level.get(level).get(Component.SNAKE))
	}
}
