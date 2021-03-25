package hard

// Result
// https://leetcode.com/submissions/detail/472309817/
object MinimumFallingPathSumII {
  def minFallingPathSum(arr: Array[Array[Int]]): Int = {
    (for {
      cols <- (1 to arr.length - 1)
      col  <- (1 to arr.length    )
    } yield {
      arr(cols)(col - 1) += {
        val add1 = arr(cols - 1).slice(0, col - 1)
        val add2 = arr(cols - 1).drop(col)
        (add1 ++ add2).min
      }
      arr(cols)
    }).last.min
  }
}
