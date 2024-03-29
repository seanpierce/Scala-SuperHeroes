class SuperHero(val name: String, val realName: String, val birthPlace: String) {
  println("A new hero has been created: " + name)

  def this(name: String) {
    this(name, "", "")
  }

  def this(name: String, birthplace: String) {
    this(name, "", birthplace)
  }

  def details() = {
    println(name + " was born in " + birthPlace)
  }

  var heroAge = 0

  def age = heroAge

  def age_=(newAge: Int): Unit = {
    if (newAge > heroAge)
      heroAge = newAge
  }
}
