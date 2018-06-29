package model

import util.Constants
import util.Helper

class Point(var x: Int, var y: Int) {
  override def toString(): String = {
    "Position: ("+ x.toString() + y.toString() + ")" 
  }
  def move(position: Point): Unit = {
    x = position.x
    y = position.y
  }
}