package medium

// Result
// https://leetcode.com/submissions/detail/474640588/
object BulbSwitcherIII {
  def numTimesAllBlue(light: Array[Int]): Int = {
    var _now = 0
    (0 until light.length).map { i =>
      _now = math.max(_now, light(i))
      (_now == (i + 1)) match {
        case true  => 1
        case false => 0
      }
    }.sum
  }
}
