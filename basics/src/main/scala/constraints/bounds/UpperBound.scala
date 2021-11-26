package constraints.bounds

class Animal
class Dog extends Animal
class Puppy extends Dog

class AnimalCarer{
  /**
  [T <: Ordered[T]]
  Here We have defined Upper Bound from Type Parameter T to Type Ordered[T]. Then T much be either Ordered or subtype of Ordered type.
**/
//dog or sub classes of dog
  def display [T <: Dog](t: T)={
    println(t)
  }
//puppy or super classes puppy
  def displaylower [T >: Puppy](t: T)={
    println(t)
  }
}

object ScalaUpperBoundsTest {
  def main(args: Array[String]) ={

    val animal = new Animal
    val dog = new Dog
    val puppy = new Puppy

    val animalCarer = new AnimalCarer

    //animalCarer.display(animal)
    animalCarer.display(dog)
    animalCarer.display(puppy)

    animalCarer.displaylower(dog)
    animalCarer.displaylower(animal)

  }
}
