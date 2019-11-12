package easy

// Result
// https://leetcode.com/submissions/detail/278205665/
object PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    x.toString == x.toString.reverse
  }
}
