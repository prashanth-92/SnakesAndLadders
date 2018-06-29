package core

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Set

import model.DifficultyLevel
import model.DifficultyLevel.DifficultyLevel
import model.LadderPosition
import model.SnakePosition
import util.LadderHelper
import util.SnakeHelper
import model.Point

object ComponentEngine {
  def generate(level: DifficultyLevel): (List[SnakePosition], List[LadderPosition]) = {
	  (generateSnakes(level), generateLadders(level))
	}
	def generateSnakes(level: DifficultyLevel): List[SnakePosition] ={
	  val snakesToGenerate = SnakeHelper.getNumberofSnakes(level)
	  var snakes= ListBuffer[SnakePosition]()
	  for(i <- 0 until snakesToGenerate){
	    snakes+= new SnakePosition(PointGenerator.getPoint(), PointGenerator.getPoint())
	  }
	  snakes.toList
	}
	def generateLadders(level:DifficultyLevel): List[LadderPosition] = {
	  val laddersToGenerate = LadderHelper.getNumberofLadders(level)
	  var ladders= ListBuffer[LadderPosition]()
	  for(i <- 0 until laddersToGenerate){
	    ladders+= new LadderPosition(PointGenerator.getPoint(), PointGenerator.getPoint())
	  }
	  ladders.toList
	}
}