package easy

// Result
// https://leetcode.com/submissions/detail/473769235/
object MaximumNumberOfBalloons {
  def maxNumberOfBalloons(text: String): Int = {
    replaceCount(text, 0)
  }

  private def replaceCount(text: String, count: Int): Int = {
    var _text  = text
    val target = "balloon"
    target.toCharArray.map { c =>
      _text = _text.replaceFirst(c.toString, "")
    }
    if ((text.length - _text.length) == target.length) {
      replaceCount(_text, count + 1)
    } else {
      count
    }
  }
}
