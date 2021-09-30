package medium

// Result
// https://leetcode.com/submissions/detail/563470831/
object MinimumFallingPathSum {
  def minFallingPathSum(matrix: Array[Array[Int]]): Int = {
    var _matrix = matrix
    for {
      i <- (1 until matrix.size)
      j <- (0 until matrix.size)
    } yield {
      val childTrgtIndx1 = math.max(0, j - 1)
      val childTrgtIndx2 = math.min(_matrix.size - 1, j + 1)
      _matrix(i)(j) += math.min(
        _matrix(i - 1)(j),
        math.min(
          _matrix(i - 1)(childTrgtIndx1),
          _matrix(i - 1)(childTrgtIndx2)
        )
      )
    }
    _matrix(_matrix.size - 1).min
  }
}
