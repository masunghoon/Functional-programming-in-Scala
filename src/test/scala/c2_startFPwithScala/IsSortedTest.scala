package c2_startFPwithScala

import org.scalatest._
import c2_startFPwithScala.IsSorted._

class IsSortedTest extends FunSuite {
  test ("is_sorted (exercise 2.2)") {
    assert(isSorted(Array(1, 2, 3, 4, 5), (a: Int, b: Int) => b > a))
    assert(!isSorted(Array(1, 3, 2, 4, 5), (a: Int, b: Int) => b > a))
    assert(isSorted(Array('B', 'E', 'G', 'T', 'X'), (a: Char, b: Char) => b > a))
    assert(!isSorted(Array('B', 'A', 'G', 'T', 'X'), (a: Char, b: Char) => b > a))
  }
}
