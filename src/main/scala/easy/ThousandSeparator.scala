package easy

// Result
// https://leetcode.com/submissions/detail/473805004/
object ThousandSeparator {
  def thousandSeparator(n: Int): String = {
    s"""${String.format("%,3d", n)}""".replace(",",".").trim
  }
}
