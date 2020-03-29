package medium

// Result
// https://leetcode.com/submissions/detail/315536095/
object SingleNumberIII {
  def singleNumber(nums: Array[Int]): Array[Int] = {
    nums.groupBy(n => nums.count(_ == n)).getOrElse(1, Array.empty)
  }
}