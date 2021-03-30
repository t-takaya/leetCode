package easy

// Result
// https://leetcode.com/submissions/detail/473356672/
object CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
  def isPrefixOfWord(sentence: String, searchWord: String): Int = {
    sentence.split(" ").indexWhere(s => s.startsWith(searchWord)) match {
      case v if v >= 0 => v + 1
      case v           => v
    }
  }
}
