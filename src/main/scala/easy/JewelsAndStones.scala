package easy

// Result
// https://leetcode.com/submissions/detail/272243839/
object JewelsAndStones {
  def numJewelsInStones(J: String, S: String): Int = {
    val jCharSet = J.toSet
    S.count(x => jCharSet.contains(x))
  }
}
