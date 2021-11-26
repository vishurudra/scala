package applyEg
object Greet {
  def apply(name: String): String = {
    "Hello %s".format(name)
  }
}
case class Person(name: String, age: Integer, favColor: String)

object ApplyEg2 extends App{
  // I can call apply explicitly if I want:
  Greet.apply("bob")
  // => "Hello bob"

  // Or I can call Greet like it is a function:
  Greet("bob")
  // => "Hello bob"


  val p0 = new Person("Frank", 23, "Blue") // normal constructor

  val p1 = Person("Frank", 23, "Blue") // this uses apply

  val p2 = Person.apply("Frank", 23, "Blue") // using apply manually

  case class Company(name: String)

  class People(val name: String) {}

  object People {

    def apply(name: String): Company = new Company(name)

  }

  val c = People("Bob")
  //=> Company("Bob"): Company
  println(c.name)

}
