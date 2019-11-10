package task1.warships

import task1.{Spaceship, Warship, Weapon}

class WarCruiser extends Spaceship with Warship {
  override protected val numberOfCrew: Int = 20
  override protected val strengthShields: Int = 8000
  override protected val weapon: List[Weapon] = List(new Weapon("Laser", 120, 200))
  override protected val speed: Int = 50
  override protected val strength: Int = 1000
  override protected val fuelReserve: Int = 5000
}
