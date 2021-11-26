package matcheg

object SimpleMatch {

  def main(array: Array[String])={
    val bools = List(true, false,null)
    for (bool <- bools) {
      bool match {
        case true => println("heads")
        case false => println("tails")
        case _ => println("something other than heads or tails (yikes!)")
      }
    }
  }

}
