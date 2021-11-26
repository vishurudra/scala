package tuple

object Multiply {
  def main(args: Array[String]) ={
    val m1 = (20, 12, 16, 4)

    val mul = m1._1 * m1._2 * m1._4

    println("Result is : " + mul)
    val names = ("John","Smith","Anderson","Steve","Rob")

    names.productIterator.foreach{ i =>println("Value = " + i )}
    val student = new Tuple3(12, "Rob", "IT")

    println("Concatenated String: " + student.toString())
  }
}

