package task1

trait CivilianShip extends Spaceship {
  protected val numberOfPassengers : Int
  protected val capacity : Int

  def loadСargo(weight: Int): Unit = ???

  def unloadСargo(weight: Int): Unit = ???

  override def damage(damage: Int): Unit = ???
}
