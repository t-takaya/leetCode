package medium

// Result
// https://leetcode.com/submissions/detail/563202433/
object EggDropWith2EggsAndNFloors {
  def twoEggDrop(n: Int): Int = {
    _twoEggDrop(n, 0)
  }

  private def _twoEggDrop(n: Int, count: Int): Int = {
    (n > 0) match {
      case true => {
        val reset = count + 1
        _twoEggDrop(n - reset, reset)
      }
      case false => count
    }
  }
}
