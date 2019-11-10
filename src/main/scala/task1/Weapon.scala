package task1

class Weapon(val Name: String, val damage: Int, val distance: Int) {
  def fire(distanceToTarget: Int): Int = {
    if (distanceToTarget > distance) 0
    else damage
  }
}
