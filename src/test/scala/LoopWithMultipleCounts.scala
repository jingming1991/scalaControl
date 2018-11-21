import org.scalatest.FunSuite

class LoopWithMultipleCounts extends FunSuite {

  /**
    *
    * create a loop with multiple Counters
    * using curly brackets {}
    */
  test("multiple Counters") {
    for (i <- 1 to 3; j <- 1 to 3) println(s"i is $i , and j is $j")

    val array = Array.ofDim[Int](2, 2)
    println()
    for {
      i <- 0 to 1
      j <- 0 to 1
    } array(i)(j) = i * 2 + j

    for {
      i <- 0 to 1
      j <- 0 to 1
    } println(s"($i)($j) = ${array(i)(j)}")
  }

  /**
    * there is no Ternary Operator in Scala unlike Java
    * use if /else expression
    *
    */
  test("Ternary Operator") {

    def absValue(x: Int): Int = if (x < 0) -x else x

    def max(a: Int, b: Int): Int = if (a < b) a else b
  }
}
