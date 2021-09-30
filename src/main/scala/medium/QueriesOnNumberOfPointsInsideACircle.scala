package medium

// Result
// https://leetcode.com/submissions/detail/563203283/
object QueriesOnNumberOfPointsInsideACircle {
  def countPoints(points: Array[Array[Int]], queries: Array[Array[Int]]): Array[Int] = {
    var _index = 0
    queries.foldLeft(Array.empty[Int])((arr, _) => {
      val retCnt = points.map{ point => {
        val query  = queries(_index)
        val ret1   = math.pow((point.head - query.head), 2)
        val ret2   = math.pow((point.tail.head - query.tail.head), 2)
        val target = math.pow(query.drop(2).head, 2)
        (ret1 + ret2 <= target) match {
          case true  => 1
          case false => 0
        }
      }}.sum
      _index += 1
      arr :+ retCnt
    })
  }
}
