import akka.actor.{Actor, ActorSystem, Props}

class Teacher   extends Actor {
  def receive = {
    case msg:String=>
      msg match {
        case "How does water form?"=>{
          println("Question is "+msg)
          var student=context.actorOf(Props[Student],name = "StudentActor")
          student ! "Water is combination of H and O"
        }
        case _ =>println(msg)

      }
  }
}



class Student   extends Actor {
  def receive = {
    case msg:String =>
      msg match {
        case "question"=>{
          var teacher = context.actorOf(Props[Teacher], "TeacherActor");
          println("Asking question")
          teacher ! "How does water form?"
        }
        case _=>println("Answer is "+msg)

      }

  }
}


object TeacherStudent extends  App{
  val actorSystem = ActorSystem("TeacherStudentSystem");
  val actor = actorSystem.actorOf(Props[Student], "StudentQuestionActor");
  actor ! "question"
}