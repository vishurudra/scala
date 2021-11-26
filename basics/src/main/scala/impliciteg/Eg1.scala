package impliciteg
def findAnInt(implicit x : Int) = x
object Eg1 {
 def main(array: Array[String])={
   implicit val test = 5
   println(findAnInt)
   println(findAnInt(2))
 }
}
