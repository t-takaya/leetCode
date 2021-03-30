package easy

// Result
// https://leetcode.com/submissions/detail/474171567/
object FindTheHighestAltitude {
  def largestAltitude(gain: Array[Int]): Int = {
    val lats = gain.foldLeft(0, 0){ (x, y)=> {
      (x._1 + y,
        Math.max(x._1 + y, x._2))
      }
    }
    lats._2
  }
}
