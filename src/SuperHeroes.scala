
object SuperHeroes {
  def main(args: Array [String]): Unit = {

    val superman = new SuperHero("Superman", "Clark Kent", "Krypton")

    val batman = new SuperHero("Batman")

    val spiderman = new SuperHero("Spiderman", "New York")

    val hulk = new SuperHero("Hulk", "Robert Bruce Banner", "Dayton, Ohio")

    hulk.age = 30
    println(hulk.age)

    case class PowerStats(strength: Int, speed: Int)

    val wonderWoman = new PowerStats(97, 78)

    val thor = new PowerStats(91, 80)

    def findHero(power: PowerStats) = power match {
      case PowerStats(91, 80) => "Thor"
      case PowerStats(97, 78) => "Wonder Woman"
      case PowerStats(_, _) => "Match not found"
    }

    val hero = findHero(PowerStats(97, 78))
    println(hero)
  }
}
