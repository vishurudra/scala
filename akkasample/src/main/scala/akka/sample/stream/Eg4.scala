package akka.sample.stream
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Sink, Source,Flow}
object Eg4 extends  App{
  implicit val actorSystem = ActorSystem("system")

  implicit val actorMaterializer = ActorMaterializer()
  val source = Source(1 to 3)
  val sink = Sink.foreach[Int](println)
  val doubler = Flow[Int].map(elem => elem * 2)
  val runnable = source via doubler to sink
  runnable.run
}
