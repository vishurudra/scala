package traitseg

class AnimalNew
class FrogNew extends AnimalNew with Philosophical {
  override def toString = "green"
  override def philosophize() ={
    println("It ain't easy being "+ toString +"!")
  }
}

object FrogNewMain{
  def main(array: Array[String])={
    val phrog: Philosophical = new FrogNew
    phrog.philosophize()
  }
}