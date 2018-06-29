package model

class SnakePosition(val start:Point, val end: Point) {
  override def toString(): String = {
    "start:" + start + ".end:"+end
  }
 /* override def equals(another:SnakePosition): Boolean = {
    (another.start.equals(this.start) && another.end.equals(this.end))
  }*/
}
