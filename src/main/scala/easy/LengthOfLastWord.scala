package easy

// Result
// https://leetcode.com/submissions/detail/277292861/
object LengthOfLastWord {
  def lengthOfLastWord(s: String): Int = {
    val words = s.split(" ")
    if(words.isEmpty) {
      0
    }else{
      words.last.length
    }
  }
}
