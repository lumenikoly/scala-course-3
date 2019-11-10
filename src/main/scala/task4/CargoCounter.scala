package task4

import scala.io.Source
import scala.util.matching.Regex.Match

object CargoCounter {
  val path : String = ".\\src\\main\\resources\\cargo.txt"
  private val listCargo : List[String] = readFileToList(path)
  private val _valuableWeight : Double = getValuableWeight(listCargo)
  private val _ordinaryWeight : Double = getOrdinaryWeight(listCargo)
  private val _allWeight : Double = _valuableWeight + _ordinaryWeight

  def allWeight: Double = _allWeight
  def valuableWeight : Double = _valuableWeight
  def ordinaryWeight : Double = _ordinaryWeight

  def readFileToList(path: String): List[String] = {
    val file = Source.fromFile(path)
    val list : List[String] = file.getLines().toList
    file.close()
    list
  }

  def getOrdinaryWeight(list: List[String]): Double = {
    val ordinaryWeightList = list.filter(_.startsWith("1")).map(_.drop(2))
    val ordinaryWeight : Double = ordinaryWeightList.view.map(_.toDouble * 1.1).sum
    ordinaryWeight
  }

  def getValuableWeight(list: List[String]): Double = {
    val valuableWeightList = list.filter(_.startsWith("2")).map(_.drop(2))
    def valuableWeightCalculator(weight: String): Double = {
      val counter : Int = Math.floor(weight.toDouble / 5).toInt
      weight.toDouble * 1.4 + counter * 1.1
    }
    val valuableWeight : Double = valuableWeightList.view.map(valuableWeightCalculator).sum
    valuableWeight
  }


}
