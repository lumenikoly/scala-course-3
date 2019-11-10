package task1.civilianShips

import task1.{CivilianShip, Spaceship}

class CargoCruiser extends Spaceship with CivilianShip {
  override protected val numberOfCrew: Int = 5
  override protected val numberOfPassengers: Int = 2
  override protected val speed: Int = 24
  override protected val strength: Int = 600
  override protected val fuelReserve: Int = 9000
  override protected val capacity: Int = 50000
}