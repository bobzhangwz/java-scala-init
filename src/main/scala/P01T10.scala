package S99

import java.util.NoSuchElementException

trait P01T10 {
  def last[T](seq:Seq[T]):T = {
    seq match {
      case a::Nil => a
      case a::t => last(t)
      case _ => throw new NoSuchElementException
    }
  }

  def penultimate[T](seq:Seq[T]):T = {
    seq match {
      case a::List(_) => a
      case a::t => penultimate(t)
      case _ => throw new NoSuchElementException
    }
  }

  def nth[T](idx:Int, seq:Seq[T]):T = (idx, seq) match {
    case (0, a::_) => a
    case (n, a::b) => nth(n-1, b)
    case _ =>  throw new NoSuchElementException
  }

}
