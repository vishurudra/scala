package propertybased
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.{choose,oneOf}
object SampleTest3 extends App{
  case class Person(firstName: String, lastName: String, age: Int) {
    def isTeen = age >= 13 && age <= 19
  }


    val genPerson = {
      for {
        firstName <- oneOf("A", "B", "C")
        lastName <- oneOf("U", "V", "Z")
        age <- choose(1, 100)

      }
      yield Person(firstName, lastName, age)
    }

    import org.scalacheck.Arbitrary

    implicit val person: Arbitrary[Person] = Arbitrary(genPerson)
   var check=  forAll { (p: Person) => p.isTeen == (p.age >= 13 && p.age <= 19) }
   check.check()
  }
