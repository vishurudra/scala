import akka.actor.{Actor,ActorSystem, Props, ActorRef};
import akka.util.Timeout;
import scala.concurrent.Await
import akka.pattern.ask
import scala.concurrent.duration._

class ActorExample6 extends Actor{
  def receive = {
    case message:String => println("Message received: "+message+" from outside actor instance");
      println("Replaying");
      val senderName = sender();
      senderName ! "Hello, I got your message.";      // Replying message
  }
}

object ActorExample6{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[ActorExample6], "RootActor");
    implicit val timeout = Timeout(10 seconds span);
    val future = actor ? "Hello";
    val result = Await.result(future, timeout.duration);
    println("Message received: "+result);
  }
}