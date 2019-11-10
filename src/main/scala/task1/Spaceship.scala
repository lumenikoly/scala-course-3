package task1

trait Spaceship extends Transport {
  protected val numberOfCrew : Int
  def spaceJump(distance : Int): Boolean = {
    if(distance > fuelReserve) false
      else {
        fuelReserve - distance/2
        true
      }
  }
}