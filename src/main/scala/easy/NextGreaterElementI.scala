package easy

// Result
// https://leetcode.com/submissions/detail/474215143/
object NextGreaterElementI {
  def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    for {
      num1     <- nums1
      newNums2  = nums2.drop(nums2.indexOf(num1) + 1)
    } yield {
      newNums2.filter(_ > num1).headOption match {
        case Some(n) => n
        case None    => -1
      }
    }
  }
}
