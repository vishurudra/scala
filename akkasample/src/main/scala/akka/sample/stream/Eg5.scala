package akka.sample.stream

import akka.{Done, NotUsed}
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._
import scala.concurrent.Future
object StreamExample {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("Sys")
    implicit val materializer = ActorMaterializer()
    val numbers = 1 to 100

    //We create a Source that will iterate over the number sequence
    val numberSource: Source[Int, NotUsed] = Source.fromIterator(() => numbers.iterator)
    //Only let pass even numbers through the Flow
    val isEvenFlow: Flow[Int, Int, NotUsed] = Flow[Int].filter((num) => num % 2 == 0)
    //Create a Source of even random numbers by combining the random number Source with the even number filter Flow
    val evenNumbersSource: Source[Int, NotUsed] = numberSource.via(isEvenFlow)

    //A Sink that will write its input onto the console
    val consoleSink: Sink[Int, Future[Done]] = Sink.foreach[Int](println)
    //Connect the Source with the Sink and run it using the materializer
    evenNumbersSource.runWith(consoleSink)
  }
}