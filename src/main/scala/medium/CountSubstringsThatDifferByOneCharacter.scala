package medium

// Result
// https://leetcode.com/submissions/detail/474634634/
object CountSubstringsThatDifferByOneCharacter {
  def countSubstrings(S: String, T: String): Int = {
    S.zipWithIndex.map { case(_, i) =>
      T.zipWithIndex.map { case(_, j) =>
        calc(S, T, i, j, 0, 0)
      }.sum
    }.sum
  }

  private def calc(s: String, t: String, n1: Int, n2: Int, count: Int, total: Int): Int = {
    (n1 < s.length && n2 < t.length) match {
      case true  => {
        val recount = (s.charAt(n1) != t.charAt(n2)) match {
          case true  => count + 1
          case false => count
        }
        val retotal = (recount == 1) match {
          case true  => total + 1
          case false => total
        }
        (recount == 2) match {
          case true  => retotal
          case false => calc(s, t, n1 + 1, n2 + 1, recount, retotal)
        }
      }
      case false => total
    }
  }
}
