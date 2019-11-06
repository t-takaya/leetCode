package easy

// Result
// https://leetcode.com/submissions/detail/276506135/
object SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    val numMap = nums.groupBy(identity).mapValues(_.size)
    val singleNumberTuple = numMap.toSeq.find { case(num, count) => count == 1 }.head
    singleNumberTuple._1
  }
}
