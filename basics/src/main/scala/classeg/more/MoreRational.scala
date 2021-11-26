package classeg.more

class MoreRational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)
  def add (i: Int): MoreRational = {
    new MoreRational(
      numer + i * denom,
      denom)
  }


  def + (that: MoreRational): MoreRational =
    new MoreRational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): MoreRational =
    new MoreRational(numer + i * denom, denom)
  def - (that: MoreRational): MoreRational =
    new MoreRational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): MoreRational =
    new MoreRational(numer - i * denom, denom)
  def * (that: MoreRational): MoreRational =
    new MoreRational(numer * that.numer, denom * that.denom)
  def * (i: Int): MoreRational =
    new MoreRational(numer * i, denom)
  def / (that: MoreRational): MoreRational =
    new MoreRational(numer * that.denom, denom * that.numer)
  def / (i: Int): MoreRational =
    new MoreRational(numer, denom * i)
  override def toString = numer +"/"+ denom
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}


object MoreRational{
  def main(array: Array[String])={
    var x = new MoreRational(1,10)
    println(x)
    var y = new MoreRational(1,10)
    println(y)
    println(x+y)
    print(x+10)
  }
}