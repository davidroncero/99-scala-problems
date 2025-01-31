package problems

object P02 {
  // P02 (*) Find the last but one element of a list.

  def lastButOne[A](list: List[A]): A = {
    list.apply(list.size - 1 - 1)
  }

  def lastButOneSafe[A](list: List[A]): A = {
    if (list.isEmpty) throw new NoSuchElementException
    else P02.lastButOne(list)
  }

}
