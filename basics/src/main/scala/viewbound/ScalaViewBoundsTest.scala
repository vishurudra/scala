package viewbound
/**
class Person[T <% Ordered[T]](val firstName: T, val lastName: T)= {
  def greater = if (firstName > lastName) firstName else lastName
}

object ScalaViewBoundsTest {
  def main(args: Array[String])= {
    val p1 = new Person("Rams","Posa")
    val p2 = new Person("Chintu","Charan")

    println(p1.greater)
    println(p2.greater)
  }
}**/