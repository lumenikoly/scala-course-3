import task2.{Bolt, McQueen, Rocky, Runner, Tanos}
import task3.Creature
import task4.CargoCounter

object Main extends App {

  //2
  val distance: Int = 250
  val runners:List[Runner] = List(new Rocky, new Tanos, new Bolt, new McQueen)

  def race(runners: List[Runner], distance: Int) = {
    def getTime(speed: Int, distance: Int): Int = distance/speed
    val runnersName: List[String] = runners.map(_.name)
    val runnersTime: List[Int] = runners.map(_.run)
    val results : Map[String, Int] = (runnersName zip runnersTime.map(distance/_)).toMap
    results
  }
  println(race(runners, distance).toSeq.sortBy(_._2))


  //3
  val leon : Creature = Creature(230,2,21)
  val blackMamba : Creature = Creature(2,2,0)
  val elephant : Creature = Creature(5500, 6,7)
  val nileCrocodile : Creature = Creature(230, 3,0)
  val meerkat : Creature = Creature(1,0,3)
  val cthulhu: Creature = Creature(666666,666666,66666)
    //TODO: сделать из этого тесты

  def identifyAnimal(creature: Creature): String = {
    creature match {
      case Creature(weight, length, coatLength)
        if
          weight >= 200 && weight <= 250 &&
          length >= 1 && length <= 3 &&
          coatLength >= 1 && coatLength <= 30
      => "This is Leon!"
      case Creature(weight, length, coatLength)
        if
          weight >= 0 && weight <= 2 &&
          length >= 2  && length <= 4 &&
          coatLength == 0
      => "This is Black Mamba!"
      case Creature(weight, length, coatLength)
        if
          weight > 5000 &&
          length >= 5  && length <= 7 &&
          coatLength >= 0 && coatLength <= 15
      => "This is Elephant!"
      case Creature(weight, length, coatLength)
        if
          weight >= 200 && weight <= 550 &&
          length >= 2  && length <= 4 &&
          coatLength == 0
      => "This is Nile crocodile!"
      case Creature(weight, length, coatLength)
        if
          weight >= 0 && weight <= 1 &&
          length == 0 &&
          coatLength >= 2 && coatLength <= 5
      => "This is Meerkat!"
      case _ => "Run, Forest, run! I don't know what it is!"
    }
  }

  println(identifyAnimal(leon))
  println(identifyAnimal(blackMamba))
  println(identifyAnimal(elephant))
  println(identifyAnimal(nileCrocodile))
  println(identifyAnimal(meerkat))
  println(identifyAnimal(cthulhu))

  CargoCounter.readFileToList(".\\src\\main\\resources\\cargo.txt")
  println(CargoCounter.ordinaryWeight)
  println(CargoCounter.valuableWeight)
}


