package medium

// Result
// https://leetcode.com/submissions/detail/275613771/
object MaxIncreaseToKeepCitySkyline {
  def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
    val maxVerticals = grid.map(_.max)
    val maxHorizontals = grid.transpose.map(_.max)
    val totalAdds =
        grid.zipWithIndex.map { case(row, rowNum) =>
          row.zipWithIndex.map { case(value, colNum) =>
            val maxVertical = maxVerticals(rowNum)
            val maxHorizontal = maxHorizontals(colNum)
            val maxValue = math.min(maxVertical, maxHorizontal)
            math.max(maxValue - value, 0)
          }
        }.flatten
    totalAdds.sum
  }
}
