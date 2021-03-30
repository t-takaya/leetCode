package easy

// Result
// https://leetcode.com/submissions/detail/474226331/
object ValidAnagram {
  def isAnagram(s: String, t: String): Boolean = {
    s.sorted == t.sorted
  }
}
