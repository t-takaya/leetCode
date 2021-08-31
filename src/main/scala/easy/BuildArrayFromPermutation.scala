package easy

// Result
// https://leetcode.com/submissions/detail/547224560/
object BuildArrayFromPermutation {
  def buildArray(nums: Array[Int]): Array[Int] = {
    (0 until nums.length).map(i => nums(nums(i))).toArray
  }
}
