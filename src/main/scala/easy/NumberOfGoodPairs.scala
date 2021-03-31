package easy

// Result
// https://leetcode.com/submissions/detail/474646882/
object NumberOfGoodPairs {
  def numIdenticalPairs(nums: Array[Int]): Int = {
    (1 until nums.length).map { i =>
      (0 until i).map { j =>
        (nums(i) == nums(j)) match {
          case true  => 1
          case false => 0
        }
      }.sum
    }.sum
  }
}
