package medium


// Result
// https://leetcode.com/submissions/detail/474511767/
object MinimumAddToMakeParenthesesValid {
  def minAddToMakeValid(S: String): Int = {
    val ret = replace(S)
    ret.length
  }

  private def replace(S: String): String = {
    (S.contains("()")) match {
      case true  => {
        val s = S.replace("()","")
        replace(s)
      }
      case false => S
    }
  }
}
