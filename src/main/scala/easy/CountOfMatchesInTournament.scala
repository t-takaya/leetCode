package easy

// Result
// https://leetcode.com/submissions/detail/473084452/
object CountOfMatchesInTournament {
  def numberOfMatches(n: Int): Int = {
    var _now = n
    var _sum = 0
    while(_now > 1) {
      val rate = _now / 2
      _now -= rate
      _sum += rate
    }
    _sum
  }
}
