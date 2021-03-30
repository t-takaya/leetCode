package easy

// Result
// https://leetcode.com/submissions/detail/473331875/
object MergeStringsAlternately {
  def mergeAlternately(word1: String, word2: String): String = {
    val merged = (word1.toCharArray zip word2.toCharArray).map(v => v._1.toString + v._2.toString).mkString("")
    val concat = (word2.length - word1.length, word1.length - word2.length) match {
      case (v, _ ) if v > 0 => word2.slice(word1.length, word2.length)
      case (_,  v) if v > 0 => word1.slice(word2.length, word1.length)
      case _                => ""
    }
    merged.concat(concat)
  }
}
