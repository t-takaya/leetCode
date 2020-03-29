package medium

// Result
// https://leetcode.com/submissions/detail/313318144/
object PrintWordsVertically {
  def printVertically(s: String): List[String] = {
    val split = s.split(" ")
    val maxLength = split.map(_.length).max
    val padSplit = split.map(_.padTo(maxLength,' '))
    (0 until maxLength).map { i =>
      padSplit.map(_.slice(i, i + 1)).mkString.replaceAll("\\s+$", "")
    }.toList
  }
}
