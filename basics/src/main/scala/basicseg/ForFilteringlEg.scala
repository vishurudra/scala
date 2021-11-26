package basicseg

object ForFilteringlEg {
  def main(array: Array[String]) = {
    for (a <- 1 to 10 if a % 2 == 0) {
      println(a);
    }
  }
}
