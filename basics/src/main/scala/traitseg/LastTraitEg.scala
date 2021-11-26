package traitseg
trait AnimalNew2 {
  def talk: String
}
trait CatNew extends AnimalNew2 {
  override def talk: String = "Meow"
}
trait DogNew extends AnimalNew2 {
  override def talk: String = "Woof"
}

class DogCat extends CatNew with DogNew

class CatDog extends DogNew with CatNew



object LastTraitMain {
  def main(array: Array[String])={
    val kittydoggy = new  CatDog()
   println(kittydoggy.talk)
    val sampleModel = new CatNew with DogNew
    println(sampleModel.talk)


  }
}
