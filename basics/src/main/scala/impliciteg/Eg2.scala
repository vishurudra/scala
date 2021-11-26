package impliciteg

object Eg2 {
  def multiply(x: Int)(implicit y: Int) = x * y

  def main(array: Array[String])={
    multiply(3)(10) // 30
    multiply(4)(10) // 40

 //   multiply(3)
    // error: could not find implicit value for parameter factor: Int

    implicit val z: Int = 10

    multiply(3) // 30
    multiply(4) // 40
    println(multiply(3))
    //implicit val z2: Int = 11

   // multiply(3)

  }

}
