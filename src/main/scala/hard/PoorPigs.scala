package hard

// Result
// https://leetcode.com/submissions/detail/384067549/
class PoorPigs(_words: Array[String]) {
  def poorPigs(buckets: Int, minutesToDie: Int, minutesToTest: Int): Int = {
    calcNumerOfPig((minutesToTest / minutesToDie), buckets, 0)
  }

  def calcNumerOfPig(minutes: Int, buckets: Int, result: Int): Int = {
    if(math.pow(minutes + 1, result).toInt < buckets) {
      calcNumerOfPig(minutes, buckets, result + 1)
    } else {
      result
    }
  }
}
