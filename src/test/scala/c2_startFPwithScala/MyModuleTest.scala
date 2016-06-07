package c2_startFPwithScala

import org.scalatest._
import c2_startFPwithScala.MyModule._

class MyModuleTest extends FunSuite {
  test ("factorial") {
    assert(factorial(1) == 1)
    assert(factorial(3) == 1*2*3)
    assert(factorial(5) == 1*2*3*4*5)
    assert(factorial(7) == 1*2*3*4*5*6*7)
    assert(factorial(9) == 1*2*3*4*5*6*7*8*9)
    assert(abs(-42) == 42)
  }
}
