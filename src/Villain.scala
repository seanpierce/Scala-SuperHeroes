class Villain(name: String, birthPlace: String) extends SuperHero(name: String, birthPlace: String) {

  println("A villain was created: " + name)

  override def details(): Unit = {
    println(name + " is a notorious villain!")
  }
}
