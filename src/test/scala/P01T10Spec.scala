package S99

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack

class P01T10Spec extends FlatSpec with ShouldMatchers {
  it should "find the last element of a list" in new P01T10{
    last(List(1, 1, 2, 3, 5, 8)) should equal (8)
  }

  it should " find the last but one element of a list" in new P01T10{
    penultimate(List(1, 1, 2, 3, 5, 8)) should equal (5)
  }

  it should "find the Kth element of a list" in new P01T10{
    nth(2, List(1, 1, 2, 3, 5, 8)) should equal (2)
  }
  // it should "" in new P01T10{}
}
