package medium

// Result
// https://leetcode.com/submissions/detail/303774902/
object FindAllDuplicatesInAnArray {
  def findDuplicates(nums: Array[Int]): List[Int] = {
    val numsSizeMap = nums.groupBy(identity).mapValues(_.size).toMap
    val duplicates = numsSizeMap.filter(v => v._2 == 2).keySet.toList
    duplicates
  }
}
