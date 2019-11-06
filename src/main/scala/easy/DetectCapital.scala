package easy

// Result
// https://leetcode.com/submissions/detail/276519189/
object DetectCapital {
  def detectCapitalUse(word: String): Boolean = {
    word match {
      case x if x == word.toUpperCase => true
      case x if x == word.toLowerCase => true
      case x if x == word.head.toUpper + word.tail.toLowerCase => true
      case _ => false
    }
  }
}
