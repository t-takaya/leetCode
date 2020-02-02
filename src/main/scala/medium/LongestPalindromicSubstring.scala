
package medium

import scala.collection.mutable.ListBuffer

// Result
// https://leetcode.com/submissions/detail/299590424/
object LongestPalindromicSubstring {
  def longestPalindrome(s: String): String = {
    if(s.isEmpty) return ""
    if(s == s.reverse) return s

    val palindromeList = ListBuffer.empty[String]
    var value = s
    while(value.length > 0) {
      palindromeList ++= getPalindrome(value)
      value = value.tail
    }
    val longestPalindromeList = palindromeList.groupBy(_.length).maxBy(_._1)._2
    if(longestPalindromeList.nonEmpty) {
      longestPalindromeList.head
    } else {
      ""
    }
  }

  private def getPalindrome(value: String): Seq[String] = {
    val valueList = ListBuffer.empty[String]
    value.toCharArray.foldLeft(""){(acc, v) =>
      val values = acc + v.toString
      if (values == values.reverse) {
        valueList += values
      }
      values
    }
    valueList.toSeq
  }
}
