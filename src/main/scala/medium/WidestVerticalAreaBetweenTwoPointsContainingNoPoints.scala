package medium

// Result
// https://leetcode.com/submissions/detail/546719004/
object WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
  def maxWidthOfVerticalArea(points: Array[Array[Int]]): Int = {
    val sortedPoints = points.sortWith((p1, p2) => {
      p1.head < p2.head
    })
    var minWidth = Int.MinValue
    for (i <- 1 until points.length) {
      minWidth = Math.max(minWidth, sortedPoints(i).head - sortedPoints(i - 1).head)
    }
    minWidth
  }
}
