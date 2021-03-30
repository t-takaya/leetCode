package easy

// Result
// https://leetcode.com/submissions/detail/473312794/
object RunningSumOf1dArray {
  def runningSum(nums: Array[Int]): Array[Int] = {
    nums.scanLeft(0)(_ + _).tail
  }
}
