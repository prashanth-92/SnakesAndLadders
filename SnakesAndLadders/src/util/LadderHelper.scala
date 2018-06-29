package util

import model.DifficultyLevel.DifficultyLevel
import model.Component

object LadderHelper {
  
	def getNumberofLadders(level: DifficultyLevel): Int = {
		Helper.getRandomNumber(Constants.level.get(level).get(Component.LADDER))
	}
}