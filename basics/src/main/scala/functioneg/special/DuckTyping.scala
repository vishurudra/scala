import reflect.Selectable.reflectiveSelectable
class Duck {
  def quack = println("The duck quacks")
  def walk = println("The duck walks")
}

class Dog {
  def quack = println("The dog quacks (barks)")
  def walk = println("The dog walks")
}

def testDuckTyping(animal: { def quack:Unit;def walk:Unit }) = {
  animal.quack
  animal.walk
}

object MainDuck extends App
{
  testDuckTyping(new Duck)
  testDuckTyping(new Dog)
}