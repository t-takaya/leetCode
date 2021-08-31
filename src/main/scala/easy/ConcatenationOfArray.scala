package easy

// Result
// https://leetcode.com/submissions/detail/547226355/
object ConcatenationOfArray {
  def getConcatenation(nums: Array[Int]): Array[Int] = {
    (0 until nums.length * 2).map(i => nums(i % nums.length)).toArray
  }
}
