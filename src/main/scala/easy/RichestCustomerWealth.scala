package easy

// Result
// https://leetcode.com/submissions/detail/473313853/
object RichestCustomerWealth {
  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts.map(_.sum).max
  }
}
