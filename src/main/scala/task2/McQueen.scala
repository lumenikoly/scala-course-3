package task2

import scala.util.Random

class McQueen extends Runner {
  override val name: String = "McQueen"
  override def run: Int = Random.between(0,80)
}