package medium

// Result
// https://leetcode.com/submissions/detail/315532816/
object SingleNumberII {
  def singleNumber(nums: Array[Int]): Int = {
    val singleNumberOpt = nums.groupBy(n => nums.count(_ == n)).get(1).flatMap(_.headOption)
    singleNumberOpt.getOrElse(0)
  }
}