package easy

// Result
// https://leetcode.com/submissions/detail/474652068/
object SmallestRangeI {
  def smallestRangeI(A: Array[Int], K: Int): Int = {
    val max = A.max
    val min = A.min
    val rate = K * 2
    ((max - min) - rate) match {
      case v if v > 0 => v
      case _          => 0
    }
  }
}
