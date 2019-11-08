package task2
import scala.util.Random

class Tanos extends Runner {
  override val name: String = "Tanos"
  override def run: Int = Random.between(0,50)
}
