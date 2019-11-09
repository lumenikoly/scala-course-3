package task4
import java.nio.file.Path

import scala.io.Source
import scala.math.BigDecimal.RoundingMode

object CargoCounter {
  val path : String = ".\\src\\main\\resources\\cargo.txt"
  private val listCargo : List[String] = readFileToList(path)
  private val _valuableWeight : BigDecimal = getValuableWeight(listCargo)
  private val _ordinaryWeight : BigDecimal = getOrdinaryWeight(listCargo)
  private val _allWeight : BigDecimal = _valuableWeight + _ordinaryWeight

  def allWeight: BigDecimal = _allWeight
  def valuableWeight : BigDecimal = _valuableWeight
  def ordinaryWeight : BigDecimal = _ordinaryWeight

  def readFileToList(path: String): List[String] = {
    val file = Source.fromFile(path)
    val list : List[String] = file.getLines().toList
    file.close()
    list
  }

  def getOrdinaryWeight(list: List[String]): BigDecimal = {
    val ordinaryWeightList = list.filter(_.startsWith("1")).map(_.drop(2))
    val ordinaryWeight : BigDecimal = ordinaryWeightList.view.map(_.toDouble * 1.1).sum
    ordinaryWeight.setScale(2,RoundingMode.FLOOR)
  }

  def getValuableWeight(list: List[String]): BigDecimal = {
    val valuableWeightList = list.filter(_.startsWith("2")).map(_.drop(2))
    def funk(weight: String): BigDecimal = {
      val counter : BigDecimal = Math.floor(weight.toDouble / 5).toInt
      weight.toDouble * 1.4 + counter * 1.1
    }
    val valuableWeight : BigDecimal = valuableWeightList.map(funk).sum
    valuableWeight.setScale(2,RoundingMode.FLOOR)
  }


}
