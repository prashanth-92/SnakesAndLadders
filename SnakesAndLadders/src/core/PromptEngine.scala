package core

import scala.io.StdIn

object PromptEngine {
  def quitPrompt():String = {
	  println("You have decided to quit the game, no progress will be saved. Do you want to continue?")
	  prompt()
	}
	def prompt(): String = {
	  readLine()
	}
}