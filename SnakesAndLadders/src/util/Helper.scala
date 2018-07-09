package util

import scala.util.Random
import model.Point

object Helper {
  val r = Random
  def getRandomNumber(max: Int): Int = {
			r.nextInt(max)
	}
  def rollDice(): Int = {
	 getRandomNumber(6) + 1
	}
  def reachedEnd(position: Point): Boolean = {
    (position.x == Constants.ROWS && position.y == Constants.COLUMNS)
  }
}