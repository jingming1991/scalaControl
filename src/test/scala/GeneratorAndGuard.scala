import org.scalatest.FunSuite

class GeneratorAndGuard extends FunSuite {
  /**
    * <- A to B can generate a Range directly
    * <- A to B = foreach
    *
    * guards : if statement in for loop
    * guards = withFilter
    *
    */
  test("Generators And Guards") {
    val a = 1 to 10
    for (i <- a) println(i)

    for (i <- 0 until 10 if i % 2 != 0) println(i)
    val newArr = for (i <- 0 until 10 if i % 2 != 0) yield i
    newArr.foreach(i => print(i + " "))
  }

  /**
    * loop over an Map
    * for((key,value) <- Map)
    */
  test("loop a Map") {
    val names = Map(1 -> "ming", 2 -> "jing")
    for ((key, value) <- names) println(s"$key is $value ")
  }

}
