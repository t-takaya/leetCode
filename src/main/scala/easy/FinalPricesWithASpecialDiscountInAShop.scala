package easy

// Result
// https://leetcode.com/submissions/detail/474187264/
object FinalPricesWithASpecialDiscountInAShop {
  def finalPrices(prices: Array[Int]): Array[Int] = {
    val len = prices.length
    val arr = Array.ofDim[Int](len)
    (0 until len).foreach { i =>
      arr(i) = prices(i)
      var _complete = false
      (i + 1 until len).foreach { j =>
        if (prices(j) <= prices(i) && !_complete) {
          arr(i) -= prices(j)
          _complete = true
        }
      }
    }
    arr
  }
}
