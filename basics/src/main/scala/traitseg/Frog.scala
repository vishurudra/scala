package traitseg

class Frog extends Philosophical {
  override def toString = "green"
}

object FrogMain{
  def main(array: Array[String])={
    val frog = new Frog
    frog.philosophize()
    val secondFrog:Philosophical =  new Frog
    secondFrog.philosophize()
  }
}