import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {
//    println("Hello world!")
    println("Enter the amount : ")
    val num = readInt()

    var interest = findInterest(num);
    println("Amount = "+num);
    println("Interest = "+ interest);
  }

  def findInterest(number:Double): Double = number match {
    case x if x<0 => x*0
    case x if x<20000 => x*0.02
    case x if x<200000 => x*0.04
    case x if x<2000000 => x*0.035
    case x if x>=2000000 => x*0.065

  }
}