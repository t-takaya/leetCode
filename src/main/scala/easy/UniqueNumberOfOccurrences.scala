package easy

// Result
// https://leetcode.com/submissions/detail/272560267/
object UniqueNumberOfOccurrences {
  def uniqueOccurrences(arr: Array[Int]): Boolean = {
    val occurrences = arr.groupBy(identity).mapValues(_.length).values.toSeq
    val distinctByOccurrences = occurrences.distinct
    occurrences.length == distinctByOccurrences.length
  }
}
