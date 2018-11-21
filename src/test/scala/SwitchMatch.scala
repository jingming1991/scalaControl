import org.scalatest.FunSuite

class SwitchMatch extends FunSuite {

  /**
    * if you're not concerned about the value of the default match
    * case - ：the default ，catch all
    *
    * otherwise, you can assign a variable to default match value
    * case name ：catch the default with a variable so you can print it
    *
    * if you don't handle the default case, MatchError Exception maybe throw
    */
  test("match") {
    primeNumber(1)
    primeNumber(7)

    println(getClassAsString("2d"))
    println(getClassAsString(2d))
  }

  def primeNumber(i: Int): Unit = {
    i match {
      case 1 => println(i + "!")
      case 2 => println(i + "~")
      case _ => println("unexpected case:")
    }
  }

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => i + " is Int"
    case f: Float => f + " is Float"
    case default => "default"
  }

  /**
    * matching multiple conditions
    * using |
    *
    * match multiple case object :executeCommand
    */
  test("matching multiple conditions") {
    val i = 5
    i match {
      case 1 | 2 | 3 => println("*")
      case 5 | 6 | 7 => println("#")
      case _ => println("nothing")
    }


    val s = "m"
    s match {
      case "jing" | "ming" => println("*")
      case "m" | "i" | "n" | "g" => println("#")
      case _ => println("nothing")
    }
  }

  trait Command

  case object Start extends Command

  case object Go extends Command

  case object Stop extends Command

  def executeCommand(cmd: Command): Unit = cmd match {
    case Start | Go => println("!")
    case Stop => println("*")
    case _ => println("default")
  }


  /**
    * Scala does't have break
    */
  test("break") {

  }
}
