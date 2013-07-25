package S99

import java.util.NoSuchElementException

trait P01T10 {
  def last[T](seq:Seq[T]):T = {
    seq match {
      case List(a) => a
      case a::t => last(t)
      case _ => throw new NoSuchElementException
    }
  }
}
