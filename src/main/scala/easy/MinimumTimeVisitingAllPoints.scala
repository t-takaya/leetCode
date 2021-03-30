package easy

// Result
// https://leetcode.com/submissions/detail/474164019/
object MinimumTimeVisitingAllPoints {
  def minTimeToVisitAllPoints(points: Array[Array[Int]]): Int = {
    points.sliding(2,1).map{ case Array(x, y) =>
      math.abs(x(0) - y(0)) max math.abs(x(1) - y(1))
    }.sum
  }
}
