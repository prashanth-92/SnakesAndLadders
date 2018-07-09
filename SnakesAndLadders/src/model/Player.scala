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
			if(position.y >= Constants.COLUMNS && position.x >= Constants.ROWS){
			  val moveBackPlaces: Int = places * -1
			  move(moveBackPlaces, snakePos, ladderPos)
			}
			handleSnake(snakePos)
			handleLadder(ladderPos)
	}
	private def handleSnake(snakePos: List[SnakePosition]): Unit = {
			val filteredSnakes = snakePos.filter(x => equals(x.start, position))
					if(!filteredSnakes.isEmpty){
						position.move(filteredSnakes(0).end)
					}

	}
	private def handleLadder(ladderPos: List[LadderPosition]): Unit = {
			val filteredLadders = ladderPos.filter(x => equals(x.start, position))
					if(!filteredLadders.isEmpty){
						position.move(filteredLadders(0).end)
					}
	}
	private def equals(p1: Point, p2: Point): Boolean = {
			(p1.x == p2.x && p1.y == p2.y)
	}
}