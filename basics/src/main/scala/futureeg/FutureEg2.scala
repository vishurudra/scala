package futureeg
import scala.concurrent.Future
import concurrent.ExecutionContext.Implicits.global
object FutureEg2 extends App{
  val input = "5" // let's try "5", "200", and "abc"
  case class NumberTooLarge() extends Throwable()
  val f = for {
    f1 <- Future{ input.toInt }
    f2 <- if (f1 > 100) {
      Future.failed(NumberTooLarge())
    } else {
      Future.successful(f1)
    }
  } yield f2
  f map(println) recover {case e => e.printStackTrace()}
}
