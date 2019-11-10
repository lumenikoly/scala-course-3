package task1.warships

import task1.{Spaceship, Warship, Weapon}

class WarDreadnought extends Spaceship with Warship {
  override protected val numberOfCrew: Int = 5000
  override protected val strengthShields: Int = 70000
  override protected val weapon: List[Weapon] = List(new Weapon("Laser", 1000, 300))
  override protected val speed: Int = 10
  override protected val strength: Int = 90000
  override protected val fuelReserve: Int = 100000

}
