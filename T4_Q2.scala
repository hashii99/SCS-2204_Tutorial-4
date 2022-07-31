import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter a number : ")
    var num = readInt()

    println(checkNumber(num))
  }

  def checkNumber(number:Int): String = number match {
    case x if x<0 => "Negative"
    case x if x==0 => "Zero"
    case x if x%2==0 => "Even"
    case x if x%2==1 => "Odd"
  }
}