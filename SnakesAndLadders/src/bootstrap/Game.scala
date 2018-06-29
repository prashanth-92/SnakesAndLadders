package bootstrap

import core.ComponentEngine
import core.PlayerEngine
import model.DifficultyLevel
import model.LadderPosition
import model.Player
import model.SnakePosition
import util.Helper
import core.PromptEngine

object Game {
	def main(args: Array[String]): Unit = {
	  println("start")
	  val (snakePos: List[SnakePosition], ladderPos: List[LadderPosition]) = ComponentEngine.generate(DifficultyLevel.EASY)
	  val players: List[Player] = PlayerEngine.createPlayers()
	  println("List of Players")
	  players.foreach(println)
	  var continueGame: Boolean = true
	  var activePlayer: Int = PlayerEngine.getFirstPlayer(players)
	  while(continueGame){
	    val player: Player = players(activePlayer)
	    println("Current Player: "+player.name+". Press 1 to roll the dice")
	    val input = PromptEngine.prompt() 
	    if(input.equalsIgnoreCase("1")){
	      play(player, snakePos, ladderPos)
	      activePlayer = PlayerEngine.getNextPlayer(players, activePlayer)
	    }
	    else if(input.equalsIgnoreCase("quit") && PromptEngine.quitPrompt().equalsIgnoreCase("Y")){
  	    continueGame = false
	    }
	  }
	  println("------snakes")
	  println(snakePos)
	  println("------ladders")
	  println(ladderPos)
	  println("------players")
	  print(players)
	}
	def play(activePlayer: Player, snakePos: List[SnakePosition], ladderPos: List[LadderPosition]): Unit = {
	  val pos: Int = Helper.rollDice()
	  println("Dice:"+pos)
	  activePlayer.move(pos,snakePos,ladderPos)
	  println(activePlayer.position)
	}
}