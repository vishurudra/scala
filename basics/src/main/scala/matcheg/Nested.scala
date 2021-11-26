package matcheg
class Role
case object Manager extends Role
case object Developer extends Role
case class Person(name: String, age: Int, role: Role)

object Nested {
  def main(array: Array[String])= {
    val alice = new Person("Alice", 25, Developer)
    val bob = new Person("Bob", 32, Manager)
    val charlie = new Person("Charlie", 32, Developer)
    for (item <- Map(1 -> alice, 2 -> bob, 3 -> charlie)) {
      item match {
        case (id, p @ Person(_, _, Manager)) => println(p.name +" is overpaid.\n")
        case (id, p @ Person(_, _, _)) => println(p.name +" is underpaid.\n")
      }
    }
  }
}
