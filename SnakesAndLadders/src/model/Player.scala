package model

import util.Constants

class Player(var position: Point, val name: String) {
	override def toString(): String = {
			"position:"  + position.toString() + "name:" + name
	}
	def move(places: Int, snakePos: List[SnakePosition], ladderPos: List[LadderPosition]): Unit = {
			if((position.x + places) <= Constants.COLUMNS){
				position.x += places
			}
			else{
				position.y += (position.x + places) / Constants.COLUMNS
						position.x = (position.x + places) - Constants.COLUMNS 
			}
			handleSnake(snakePos)
			handleLadder(ladderPos)
	}
	private def handleSnake(snakePos: List[SnakePosition]): Unit = {
			val filteredSnakes = snakePos.filter(equals)
					if(!filteredSnakes.isEmpty){
						position.move(filteredSnakes(0).end)
					}
			/*snakePos.foreach(spos=> {
      if(equals(spos.start, position)){
        println("-----snake")
        println(spos)
        position.move(spos.end)
      }
    })*/
	}
	private def handleLadder(ladderPos: List[LadderPosition]): Unit = {
			val filteredLadders = ladderPos.filter(equals)
					if(!filteredLadders.isEmpty){
						position.move(filteredLadders(0).end)
					}

			/*ladderPos.foreach(lpos => {
      if(equals(lpos.start, position)){
        println("-----ladder")
        println(lpos)
        position.move(lpos.end)
      }
    })*/
	}
	private def equals(p1: Point, p2: Point): Boolean = {
			(p1.x == p2.x && p1.y == p2.y)
	}
}