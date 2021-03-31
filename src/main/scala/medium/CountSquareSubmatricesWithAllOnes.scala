package medium

// Result
// https://leetcode.com/submissions/detail/474531617/
object CountSquareSubmatricesWithAllOnes {
  def countSquares(matrix: Array[Array[Int]]): Int = {
    val len = (matrix.length > 0) match {
      case true  => matrix.head.length
      case false => 0
    }
    (for {
      i <- 0 until matrix.length
      j <- 0 until len
    } yield {
      if (matrix(i)(j) == 1 && i > 0 && j > 0) {
        val target = Math.min(matrix(i - 1)(j), matrix(i)(j - 1))
        matrix(i)(j) += Math.min(matrix(i-1)(j - 1), target)
      }
      matrix(i)(j)
    }).sum
  }
}
