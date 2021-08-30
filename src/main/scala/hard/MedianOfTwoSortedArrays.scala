package hard

// Result
// https://leetcode.com/submissions/detail/546739510/
object MedianOfTwoSortedArrays {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val newNums = new Array[Int](nums1.length + nums2.length)
    Array.copy(nums1, 0, newNums, 0, nums1.length)
    Array.copy(nums2, 0, newNums, nums1.length, nums2.length)
    val sortedNewNums    = newNums.sorted
    val medianForNewNums = newNums.length / 2
    (newNums.length % 2 == 1) match {
      case true  => sortedNewNums(medianForNewNums)
      case false => (sortedNewNums(medianForNewNums) + sortedNewNums(medianForNewNums - 1)) / 2.0
    }
  }
}
