package easy

// Result
// https://leetcode.com/submissions/detail/473319398/
object ShuffleString {
  def restoreString(s: String, indices: Array[Int]): String = {
    (s.toCharArray zip indices).sortBy(_._2).map(_._1).mkString("")
  }
}
