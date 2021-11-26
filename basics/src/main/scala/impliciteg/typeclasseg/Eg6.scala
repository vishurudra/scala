package impliciteg.typeclasseg

import impliciteg.*

trait CanChat[A] {
  def chat(x: A): String
}
case class Person(firstName: String, lastName: String)

object PersonCanChat extends CanChat[Person] {
  def chat(x: Person) = s"Hi, I'm ${x.firstName}"
}

final case class Dog(name: String)

object DogCanChat extends CanChat[Dog] {
  def chat(x: Dog) = s"Woof, my name is ${x.name}"
}

object ChatUtil {
  def chat[A](x: A, chattyThing: CanChat[A]) = {
    chattyThing.chat(x)
  }
}
object ChattyAddons {
  implicit object PersonCanChat extends CanChat[Person] {
    def chat(x: Person) = s"Hi, I'm ${x.firstName}"
  }
  implicit object DogCanChat extends CanChat[Dog] {
    def chat(x: Dog) = s"Woof, my name is ${x.name}"
  }
}


object ChatUtilModified {
  def chat[A](x: A)(implicit chattyThing: CanChat[A]) = {
    chattyThing.chat(x)
  }
}

object PersonCanChatFormally extends CanChat[Person] {
  def chat(x: Person) = s"Hello, I'm ${x.firstName} ${x.lastName}"
}
object Eg6 extends App{
  println(ChatUtil.chat(Dog("Meg"), DogCanChat))
 println( ChatUtil.chat(Person("John", "Smith"), PersonCanChat))
 println( ChatUtil.chat(Person("John", "Smith"), PersonCanChatFormally))
  import ChattyAddons.*

  println(ChatUtilModified.chat(Person("John", "Smith")))
  println(ChatUtilModified.chat(Dog("Meg")))
}
