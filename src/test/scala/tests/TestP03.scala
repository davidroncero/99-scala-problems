package tests

trait TestP03 { this: munit.FunSuite =>
  test("P03.Find the Kth element of a list.") {
    assertEquals(problems.P03.nthElement(2, List(1, 1, 2, 3, 5, 8)), 2)
  }

  test("P03.Find the Kth element of a list. - Empty list") {
    intercept[NoSuchElementException] {
      problems.P03.nthElementSafe(2, List())
    }
  }

  test("P03.Find the Kth element of a list. - index out of size") {
    intercept[NoSuchElementException] {
      problems.P03.nthElementSafe(10, List(1, 2, 3, 4, 5))
    }
  }
}
