package core

import util.Helper
import model.Point
import util.Constants

object PointGenerator {
  def getPoint(): Point = {
    val x = Helper.getRandomNumber(Constants.COLUMNS)
    val y = Helper.getRandomNumber(Constants.ROWS)
    new Point(x,y)
  }
}
