package easy

// Result
// https://leetcode.com/submissions/detail/474187264/
object CountNegativeNumbersInASortedMatrix {
  def countNegatives(grid: Array[Array[Int]]): Int = {
    grid.map(_.count(_ < 0)).sum
  }
}
