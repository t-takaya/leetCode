package easy

// Result
// https://leetcode.com/submissions/detail/276501338/
object ReverseWordsInAStringIII {
  def reverseWords(s: String): String = {
    s.split(" ").map(_.reverse).mkString(" ")
  }
}
