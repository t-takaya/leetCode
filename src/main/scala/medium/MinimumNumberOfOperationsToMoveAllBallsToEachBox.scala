package medium

// Result
// https://leetcode.com/submissions/detail/473370338/
object MinimumNumberOfOperationsToMoveAllBallsToEachBox {
  def minOperations(boxes: String): Array[Int] = {
    (0 until boxes.length).map { i =>
      (0 until boxes.length).zipWithIndex.map { case(_, j) =>
        (boxes.charAt(j) - '0') * Math.abs(j - i)
      }.sum
    }.toArray
  }
}
