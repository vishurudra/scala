package akka.sample.stream
import akka.{Done, NotUsed}
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._
object Eg6 extends App {

  implicit val system = ActorSystem("actor-system")

  Source(List("#Scala", "#akka", "#JVM", "#StReam", "#Kafka","#F#"))
    .map(element => element.substring(1))
    .map(element => element.toLowerCase)
    .filter(element => element.length > 3)
    .to(Sink.foreach(element => println(element)))
    .run()
}