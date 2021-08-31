package easy

// Result
// https://leetcode.com/submissions/detail/547246502/
object CheckIfTheSentenceIsPangram {
  def checkIfPangram(sentence: String): Boolean = {
    sentence.toCharArray.distinct.length == 26
  }
}
