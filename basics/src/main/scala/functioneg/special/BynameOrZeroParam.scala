package functioneg.special

object BynameOrZeroParam {
  def byName(int: => Int) = {
     println(int)
       println(int)
     }

  def main(array: Array[String])={
    byName(10)

  }

}
