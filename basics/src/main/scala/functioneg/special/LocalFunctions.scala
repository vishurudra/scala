package functioneg.special

object LocalFunctions {
  def average(in: Int*): Int = {
    def sum(in: Int*): Int = in.sum
    def count(in: Int*): Int = in.size
    sum(in:_*)/count(in:_*)
  }

  def main(array: Array[String])={
    val items = Seq(1,2,3,4,5)
    val avg = average(items:_*)
    println(avg)
    val secondavg = Seq(22,33,44)
    println(average(secondavg:_*))
  }
}
