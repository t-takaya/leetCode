package easy

// Result
// https://leetcode.com/submissions/detail/474202666/
object SquaresOfASortedArray {
  def sortedSquares(nums: Array[Int]): Array[Int] = {
    nums.map(n => n * n).sorted
  }
}
