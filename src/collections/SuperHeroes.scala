package collections

import scala.collection.mutable.ArrayBuffer

object SuperHeroes {
  def main(args: Array [String]): Unit = {
    val numbers = new Array[Int](10)

    val words = new Array[String](10)

    //val heroes = Array("Sean", "Charlie", "Lizi", "Gracie", "Pearl")
    //println(heroes(3))

    val mutableHeroes = ArrayBuffer("Sean", "Charlie", "Lizi", "Gracie", "Pearl")
    mutableHeroes += "Penny"

    val moreHeroes = Array("Gary", "Manu", "Katie")

    mutableHeroes ++= moreHeroes

    mutableHeroes.trimEnd(3)

    mutableHeroes.update(1, "Chucky")

    //println(mutableHeroes)

    //for (elem <- mutableHeroes) println(elem)

    for (elem <- 0 until mutableHeroes.length) println((elem + 1) + " - " + mutableHeroes(elem))

    val heroesWithEInName = for (elem <- mutableHeroes if elem.contains("e")) yield elem

    println(heroesWithEInName)
  }
}
