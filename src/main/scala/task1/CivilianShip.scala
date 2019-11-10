package task1

trait CivilianShip {
  protected val numberOfPassengers : Int
  protected val capacity : Int
  def loadСargo(weight: Int): Unit = ???
  def unloadСargo(weight: Int): Unit = ???
}
