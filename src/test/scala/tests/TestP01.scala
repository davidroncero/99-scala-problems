package tests

trait TestP01 { this: munit.FunSuite =>
  test("P01.Find the last element of a list") {
    assertEquals(problems.P01.last(List(1, 1, 2, 3, 5, 8)), 8)
  }
}
