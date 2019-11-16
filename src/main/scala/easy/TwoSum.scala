package easy

// Result
// https://leetcode.com/submissions/detail/279251641/
object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for (i <- nums.indices) {
      val diff = target - nums(i)
      val startIndex = i + 1
      (startIndex until nums.length).foreach { case j =>
        if (diff == nums(j)) {
          return Array(i, j)
        }
      }
    }
    return Array()
  }
}
