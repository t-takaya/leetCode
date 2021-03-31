package easy

// Result
// https://leetcode.com/submissions/detail/474648002/
object MaximumNestingDepthOfTheParentheses {
  def maxDepth(s: String): Int = {
    s.scanLeft(0){ (s1, s2) =>
      s2 match {
        case '(' => s1 + 1
        case ')' => s1 - 1
        case _   => s1
      }
    }.max
  }
}
