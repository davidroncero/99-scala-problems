package problems

import java.{util => ju}

object P03 {
  // P03 (*) Find the Kth element of a list.

  def nthElement[A](nth: Int, list: List[A]): A = {
    list.apply(nth)
  }

  def nthElementSafe[A](nth: Int, list: List[A]): A = {
    if (list.isEmpty || list.size < nth - 1) throw new NoSuchElementException
    else nthElement(nth, list)
  }
}
