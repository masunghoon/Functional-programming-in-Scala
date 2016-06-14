package c2_startFPwithScala

/** Exercise 2.2 */
object IsSorted {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = 
      if (n >= as.length - 1) true
      else if (!ordered(as(n), as(n+1))) false
      else loop(n + 1)
    
    loop(0)
  }
}
