import org.scalatest.FunSuite
import task3.Creature

class TestForIdentifyAnimal extends FunSuite{

  test("Main.identifyAnimal - Leon") {
    val leon : Creature = Creature(230,2,21)
    assert(Main.identifyAnimal(leon) === "This is Leon!")
}
  test("Main.identifyAnimal - Black Mamba") {
    val blackMamba : Creature = Creature(2,2,0)
    assert(Main.identifyAnimal(blackMamba) === "This is Black Mamba!")
  }
  test("Main.identifyAnimal - Elephant") {
    val elephant : Creature = Creature(5500, 6,7)
    assert(Main.identifyAnimal(elephant) === "This is Elephant!")
  }
  test("Main.identifyAnimal - Nile crocodile") {
    val nileCrocodile : Creature = Creature(230, 3,0)
    assert(Main.identifyAnimal(nileCrocodile) === "This is Nile crocodile!")
  }
  test("Main.identifyAnimal - Meerkat") {
    val meerkat : Creature = Creature(1,0,3)
    assert(Main.identifyAnimal(meerkat) === "This is Meerkat!")
  }
  test("Main.identifyAnimal - Random") {
    val cthulhu: Creature = Creature(666666,666666,66666)
    assert(Main.identifyAnimal(cthulhu) === "Run, Forest, run! I don't know what it is!")
  }
}




