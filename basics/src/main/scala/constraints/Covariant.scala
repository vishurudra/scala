package constraints

/**
 * If “S” is subtype of “T” then List[S] is is a subtype of List[T].

This kind of Inheritance Relationship between two Parameterized Types is known as “Covariant”


 */
object Covariant {
  class Animal[+T](val animial:T)

  class Dog
  class Puppy extends Dog

  class AnimalCarer(val dog:Animal[Dog])

  /**
   * NOTE:- As Animal class is defined by using Variance Annotation i.e. “+T”, we can pass either dogAnimal or its subtype puppyAnimal to create a AnimalCarer object.
   * @param args
   */
    def main(args: Array[String]) ={
      val puppy = new Puppy
      val dog = new Dog

      val puppyAnimal:Animal[Puppy] = new Animal[Puppy](puppy)
      val dogAnimal:Animal[Dog] = new Animal[Dog](dog)

      val dogCarer = new AnimalCarer(dogAnimal)
      val puppyCarer = new AnimalCarer(puppyAnimal)

      println("Done.")
    }



}
