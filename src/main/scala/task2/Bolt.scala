package task2

import scala.util.Random

class Bolt extends Runner {
  override val name: String = "Bolt"
  override def run: Int = Random.between(0,44)
}