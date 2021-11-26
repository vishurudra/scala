import akka.actor.Actor;          // Importing actor trait
import akka.actor.ActorSystem;
import akka.actor.Props;
class ActorExample1 extends Actor{
  def receive = {
    case message:String => println("Message received: "+message+ " from - "+ self.path.name);
      //println("sender:"+ sender());  // returns ActorRef
  }
}

object ActorExample1{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[ActorExample1], "RootActor");
    actor ! "Hello from !"             // Sending message by using !
    actor.tell("Hello from tell",null);  // Sending message by using tell() method
    // Sender is not passed here
  }
}