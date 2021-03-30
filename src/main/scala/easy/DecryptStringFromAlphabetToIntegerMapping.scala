package easy

// Result
// https://leetcode.com/submissions/detail/473716922/
object DecryptStringFromAlphabetToIntegerMapping {
  def freqAlphabets(s: String): String = {
    val alpX = Seq("a", "b", "c", "d", "e", "f", "g", "h", "i")
    val alpY = Seq("j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
    var _s   = s
    val replacedalpYS = alpY.zipWithIndex.foreach { case(y, i) =>
      _s = _s.replaceAll((i + 10) + "#", y)
    }
    alpX.zipWithIndex.foreach { case(x, i) =>
      _s = _s.replaceAll((i + 1).toString, x)
    }
    _s
  }
}
