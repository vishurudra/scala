package traitseg

class Animal
trait HasLegs{
  def haveLeg = println("Legs present")
}
class Horse extends Animal with Philosophical with HasLegs {
  override def toString = "green"
}

object  HorseMain{
  def main(array: Array[String])={
    var horse = new Horse
    horse.philosophize()
    horse.haveLeg
    
  }
}
