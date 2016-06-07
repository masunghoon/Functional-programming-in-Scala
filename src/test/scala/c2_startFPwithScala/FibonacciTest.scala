package c2_startFPwithScala

import org.scalatest._
import c2_startFPwithScala.fibonacci._

class FibonacciTest extends FunSuite {
  test ("first") {
    assert(fib(1) == 0)
  }

  test ("second") {
    assert(fib(2) == 1)
  }

  test ("third") {
    assert(fib(3) == 1)
  }

  test ("fourth") {
    assert(fib(4) == 2)
  }

  test ("fifth") {
    assert(fib(5) == 3)
  }

  test ("tenth") {
    assert(fib(10) == 34)
  }
}
