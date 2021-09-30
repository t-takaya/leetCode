package medium

// Result
// https://leetcode.com/submissions/detail/563202989/
object PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
  def minPartitions(n: String): Int = {
    n.toCharArray.foldLeft(Int.MinValue)((acc, c) => {
      val num = c - '0'
      math.max(num, acc)
    })
  }
}
