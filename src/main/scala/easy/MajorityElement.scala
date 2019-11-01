package easy

// Result
// https://leetcode.com/submissions/detail/275103464/
object MajorityElement {
  def majorityElement(nums: Array[Int]): Int = {
    val numMap = nums.groupBy(identity)
                     .mapValues(_.size)
                     .toSeq.sortWith(_._2 > _._2)
    numMap.head._1
  }
}
