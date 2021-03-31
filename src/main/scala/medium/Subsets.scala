package medium

// Result
// https://leetcode.com/submissions/detail/474552920/
object Subsets {
  def subsets(nums: Array[Int]): List[List[Int]] = {
    (0 to nums.length).flatMap { i =>
      nums.toList.combinations(i).map(_.sorted).distinct
    }.toList.sortWith { (l1, l2) =>
      l1.sum - l1.length < l2.sum - l2.length
    }
  }
}
