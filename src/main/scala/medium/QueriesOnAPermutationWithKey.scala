package medium

// Result
// https://leetcode.com/submissions/detail/474255819/
object QueriesOnAPermutationWithKey {
  def processQueries(queries: Array[Int], m: Int): Array[Int] = {
    import scala.collection.mutable.ArrayBuffer
    val nums = ArrayBuffer.from(1 to m)
    queries.map { q =>
      val i = nums.indexOf(q)
      nums.remove(i)
      q +=: nums
      i
    }
  }
}
