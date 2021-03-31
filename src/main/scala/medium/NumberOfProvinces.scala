package medium

// Result
// https://leetcode.com/submissions/detail/474645124/
object NumberOfProvinces {
  import scala.collection.mutable.Set
  def findCircleNum(isConnected: Array[Array[Int]]): Int = {
    val circle = Set.empty[Int]
    (0 until isConnected.length).map { i =>
      if (!circle.contains(i)) {
        exec(i, circle, isConnected)
        1
      } else {
        0
      }
    }.sum
  }

  private def exec(index: Int, circle: Set[Int], isConnected: Array[Array[Int]]): Unit = {
    (0 until isConnected.length).foreach { i =>
      if (isConnected(index)(i) == 1 && !circle.contains(i)) {
        circle += i
        exec(i, circle, isConnected)
      }
    }
  }
}
