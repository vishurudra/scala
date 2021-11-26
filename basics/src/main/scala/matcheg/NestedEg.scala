package matcheg

object NestedEg {
  def main(array: Array[String]) = {
    val alice = new Person("Alice", 25, Developer)
    val bob = new Person("Bob", 32, Manager)
    val charlie = new Person("Charlie", 32, Developer)
    for (item <- Map(1 -> alice, 2 -> bob, 3 -> charlie)) {
      item match {
        case (id, p: Person) => p.role match {
          case Manager => println(p.name + " is overpaid.\n")
          case _ => println(p.name + " is underpaid.\n")
        }
      }

    }
  }
}