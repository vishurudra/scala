import akka.actor.{Actor,ActorSystem, Props};

class Actor1 extends Actor{
  def receive = {
    case message:String => println("Message received in Actor 1: "+message+ " from - "+ self.path.name);
     // println("Sender: "+sender())
      var child = context.actorOf(Props[Actor2], "ChildActor");
      child ! message +" send to second"


  }
}

class Actor2 extends Actor{
  def receive = {
    case message:String => println("Message received in Actor 2 : "+message+ " from - "+ self.path.name);
      //println("Sender: "+sender());
  }
}

object ActorExample3{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[Actor1], "RootActor");
    actor ! "Hello"
  }
}  