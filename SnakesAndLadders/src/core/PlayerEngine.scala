package core

import model.Player
import scala.collection.mutable.ListBuffer
import model.Point

object PlayerEngine {
  def createPlayers(): List[Player] = {
    var players = ListBuffer[Player]()
    players += createPlayer(new Point(0,0), "Test1")
    players += createPlayer(new Point(0,0), "Test2")
    players.toList
  }
  def createPlayer(position: Point, name: String): Player = {
    var player = new Player(position, name)
    player
  }
  def getFirstPlayer(players:List[Player]): Int = {
    0
  }
  def getNextPlayer(players: List[Player], currentPlayerIndex: Int):Int = {
    if((currentPlayerIndex+1)>(players.length-1))
      return 0
    currentPlayerIndex+1
  }
}