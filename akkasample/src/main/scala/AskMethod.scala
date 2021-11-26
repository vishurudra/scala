import akka.actor.{Actor, ActorSystem, Props}
import akka.util.Timeout

import scala.concurrent.Await
import akka.pattern.ask

import java.util.concurrent.TimeUnit
import scala.concurrent.duration._

class ActorExample4 extends Actor{
  def receive = {
    case message:String => println("Message recieved: "+message);
  }
}

object ActorExample{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[ActorExample4], "RootActor");
    implicit val timeout = Timeout(1 seconds span)
    val future = actor ? "Hello";
    val result = Await.result(future, Duration.create(10.0,TimeUnit.SECONDS));
    println(result);
  }
}  