package easy

// Result
// https://leetcode.com/submissions/detail/473707087/
object CheckIfTwoStringArraysAreEquivalent {
  def arrayStringsAreEqual(word1: Array[String], word2: Array[String]): Boolean = {
    word1.mkString("") == word2.mkString("")
  }
}
