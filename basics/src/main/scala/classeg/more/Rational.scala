package classeg.more

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer +"/"+ denom
  def add(param: Rational): Rational =
    new Rational(
      numer * param.denom + param.numer * denom,
      denom * param.denom
    )

}

object RationalMore{
  def main(array: Array[String])={
    var x = new Rational(1, 3)
    println(x)
    var y = new Rational(1,10)
    println(y)
    println(x add y)
    println(x.add(y))

  }
}