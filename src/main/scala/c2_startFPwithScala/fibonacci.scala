package c2_startFPwithScala

object fibonacci {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(a: Int, b: Int, to: Int): Int = to match {
      case 0 => a
      case _ => loop(b, a+b, to-1)
    }
    
    loop(0, 1, n-1)
  }
}
