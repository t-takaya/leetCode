package easy

// Result
// https://leetcode.com/submissions/detail/473756356/
object IntersectionOfTwoArrays {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    (nums1 intersect nums2).distinct
  }
}
