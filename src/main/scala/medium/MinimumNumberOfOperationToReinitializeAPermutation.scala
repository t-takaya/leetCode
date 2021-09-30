package medium

// Result
// https://leetcode.com/submissions/detail/563472110/
object MinimumNumberOfOperationToReinitializeAPermutation {
  def reinitializePermutation(n: Int): Int = {
    val calc = (n / 2)
    _reinitializePermutation(calc, calc, 1)
  }

  private def _reinitializePermutation(target: Int, mid: Int, count: Int): Int = {
    (target != 1) match {
      case true  => {
        val resetTarget = if (target % 2 == 1) {
          mid + (target / 2)
        } else {
          target / 2
        }
        _reinitializePermutation(resetTarget, mid, count + 1)
      }
      case false => count
    }
  }
}
