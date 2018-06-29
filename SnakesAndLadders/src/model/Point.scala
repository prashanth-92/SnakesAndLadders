package model

import util.Constants
import util.Helper

class Point(var x: Int, var y: Int) {
  override def toString(): String = {
    "x:"  + x.toString() + "y:" + y.toString()
  }
 /* override def equals(another: Point): Boolean = {
    this.x == another.x && this.y == another.y
  }*/
  def move(position: Point): Unit = {
    println("moved")
    x = position.x
    y = position.y
  }
}