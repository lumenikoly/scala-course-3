package task1

trait Warship extends Spaceship {
  protected val strengthShields : Int
  protected val weapon : List[Weapon]

  override def damage(damage: Int): Unit = ???
}
