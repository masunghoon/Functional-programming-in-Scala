object PolyMorphicFunction {

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = 
      if (n >= as.length) -1 
      else if (p(as(n))) n
      else loop(n + 1)

    loop(0)
  }
}
