package util

import scala.util.Random

object Helper {
  val r = Random
  def getRandomNumber(max: Int): Int = {
			r.nextInt(max)
	}
  def rollDice(): Int = {
	 getRandomNumber(6) + 1
	}
}