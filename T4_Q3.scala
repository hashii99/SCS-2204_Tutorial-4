object Main {
  def main(args: Array[String]): Unit = {
    println(Name_Format("Benny")(-1)(toUpper(_)))
    println(Name_Format("Niroshan")(1)(toUpper(_)))
    println(Name_Format("Saman")(-1)(toLower(_)))
    println(Name_Format("Kumara")(5)(toUpper(_)))
  }

  def toUpper(name:String):String ={
    return name.toUpperCase()
  }

  def toLower(name:String):String = {
    return name.toLowerCase()
  }

  def Name_Format(name:String)(id:Int)(func:String=>String):String = {
    if(id == -1) {
      func(name)
    }
    else {
      var num = name.length()
      var temp=""
      var i=0
      while(i<num) {
        if(i==id) {
          temp=temp+func(name.charAt(i).toString)
          //charAt() -> return the character of the index passed in the argument
          //toString() -> display a string from the Scala map
        }
        else {
          temp=temp+name.charAt(i).toString
        }
        i=i+1
      }
      return temp;
    }
  }
}