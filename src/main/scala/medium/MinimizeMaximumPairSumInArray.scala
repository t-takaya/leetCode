package medium

// Result
// https://leetcode.com/submissions/detail/546713837/
object MinimizeMaximumPairSumInArray {
  def minPairSum(nums: Array[Int]): Int = {
    val lengthOfNum = nums.length - 1
    val sortedNums  = nums.sorted
    var minPairSum  = Int.MinValue
    for (i <- 0 until (nums.length / 2)) {
      minPairSum = Math.max(minPairSum, sortedNums(i) + sortedNums(lengthOfNum - i))
    }
    minPairSum
  }
}
