package medium

// Result
// https://leetcode.com/submissions/detail/473669820/
object MinimumFlipsToMakeAOrBEqualToC {
  def minFlips(a: Int, b: Int, c: Int): Int = {
    calc(0, a, b, c)
  }

  def calc(flips: Int, a: Int, b: Int, c: Int): Int = {
    var _flips = flips
    if (a > 0 || b > 0 || c > 0) {
      if ((c & 1) == 0) {
        _flips += a & 1
        _flips += b & 1
      } else {
        _flips += ~(a & 1 | b & 1) & 1
      }
      calc(_flips, a >> 1, b >> 1, c >> 1)
    } else {
      _flips
    }
  }
}

