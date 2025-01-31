package tests

trait TestP02 { this: munit.FunSuite =>
  test("P02.Find the last but one element of a list") {
    assertEquals(problems.P02.lastButOne(List(1, 1, 2, 3, 5, 8)), 5)
  }

  test("P02.Find the last but one element of a list - Empty list") {
    intercept[NoSuchElementException] {
      problems.P02.lastButOneSafe(List())
    }
  }
}
