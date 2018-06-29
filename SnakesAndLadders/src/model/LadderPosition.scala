package model

class LadderPosition(val start:Point, val end: Point) {
   override def toString(): String = {
    "start:" + start + ".end:"+end
  }
}