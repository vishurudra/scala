package propertybased

object SampleTest1 extends App{
  case class User(name: String, age: Int)

  import org.scalacheck.{ Gen, Arbitrary }
  import Arbitrary.arbitrary
  implicit val randomUser: Arbitrary[User] = Arbitrary(for {
    randomName <- Gen.alphaStr
    randomAge  <- Gen.choose(0,80)

  } yield User(randomName, randomAge))


  println(randomUser.arbitrary.sample)
  def isAdult: User => Boolean = _.age >= 18
  def isAllowedToDrink : User => Boolean = _.age >= 21

  import org.scalacheck.Prop.forAll
  val allAdultsCanDrink = forAll { (u: User) =>
    println(u)
    if(isAdult(u)) isAllowedToDrink(u) else true }
  allAdultsCanDrink.check()
}
