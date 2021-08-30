package medium

// Result
// https://leetcode.com/submissions/detail/546699023/
object MinimumOperationsToMakeArrayEqual {
  def minOperations(n: Int): Int = {
    val number = n / 2
    number * (number + (n % 2))
  }
}
