import org.scalatest.FunSuite
import task4.CargoCounter

class TestCargoCounter extends FunSuite {

  test("CargoCounter.ordinaryWeight") {
    assert(CargoCounter.ordinaryWeight == 24.75)
  }
  test("CargoCounter.valuableWeight") {
    assert(CargoCounter.valuableWeight == 53.52)
  }
  test("CargoCounter.allWeight") {
    assert(CargoCounter.allWeight == 78.28)
  }
}
