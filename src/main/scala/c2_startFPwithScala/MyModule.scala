package c2_startFPwithScala

object MyModule {
  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d" 
    msg.format(name, n, f(n))
  }

  def abs(n: Int): Int = if (n < 0) -n else n

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =  //루프용 보조 함수에는 보통 go 나 loop라는 이름을 붙이는 것이 관례
      if (n <= 0) acc 
      else go(n-1, n*acc)
      
    go (n, 1)
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute value", -42, abs))
    println(formatResult("factorial", 7, factorial)) 
  }
}
