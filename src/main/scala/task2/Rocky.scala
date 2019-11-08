package task2

import scala.util.Random

class Rocky extends Runner {
  override val name: String = "Rocky"
  override def run: Int = Random.between(0,42)
}