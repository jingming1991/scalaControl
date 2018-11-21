import org.scalatest.FunSuite

class ControlStructures extends FunSuite {

  /**
    * for loop
    * - single return
    * - multiple lines
    */
  test("loop over collection") {
    val a = Array("apple", "banana", "orange")
    for (e <- a) println(e)

    for (e <- a) {
      val s = e.toUpperCase
      println(s)
    }


  }

  /**
    * yield == map
    *
    * for / yield loop create a new collection of the same type as input collection
    */
  test("return loop value") {
    val a = Array("apple", "banana", "orange")
    val newArray = for (e <- a) yield e.toLowerCase
    val newArray1 = for (e <- a) yield {
      val s = e.toLowerCase
      s
    }
  }

  /**
    * get Array's index and item when looping
    * - for (i <- 0 until a.length)   (index,Array(index))
    * - for (i <- Array.indices)      (index,Array(index))
    * - for ((e, count) <- Array.zipWithIndex)   (e,count)
    */
  test("loop count") {
    val a = Array("apple", "banana", "orange")
    for (i <- 0 until a.length) println(s"$i is ${a(i)}")
    println()
    for (i <- a.indices) println(s"$i is ${a(i)}")
    println()
    for ((e, count) <- a.zipWithIndex) println(s"$count is $e")
  }
}
