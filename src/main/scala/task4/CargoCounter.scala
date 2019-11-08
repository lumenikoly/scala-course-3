package task4
import java.nio.file.Path

import scala.io.Source

object CargoCounter {
  val path : String = ".\\src\\main\\resources\\cargo.txt"
  private val listCargo : List[String] = readFileToList(path)
  private val _allWeight : Float = 0
  private val _valuableWeight : Double = getValuableWeight(listCargo)
  private val _ordinaryWeight : Double = getOrdinaryWeight(listCargo)

  def allWeight: Float = _allWeight
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
    val ordinaryWeight : Double = ordinaryWeightList.map(_.toDouble * 1.1).sum
    ordinaryWeight
  }
 




}
