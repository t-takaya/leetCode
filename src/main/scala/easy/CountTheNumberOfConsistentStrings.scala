package easy

// Result
// https://leetcode.com/submissions/detail/474127592/
object CountTheNumberOfConsistentStrings {
  def countConsistentStrings(allowed: String, words: Array[String]): Int = {
    words.count { word =>
      word.toCharArray.forall(w => allowed.contains(w))
    }
  }
}
