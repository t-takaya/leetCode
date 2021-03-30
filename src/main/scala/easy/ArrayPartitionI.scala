package easy

// Result
// https://leetcode.com/submissions/detail/474200951/
object ArrayPartitionI {
  def arrayPairSum(nums: Array[Int]): Int = {
    val gnums    = nums.sorted.grouped(2)
    val mingnums = gnums.map(_.min)
    mingnums.sum
  }
}
