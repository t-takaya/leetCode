package easy

// Result
// https://leetcode.com/submissions/detail/474221672/
object WaterBottles {
  def numWaterBottles(numBottles: Int, numExchange: Int): Int = {
    calc(numBottles, numExchange, 0, 0)
  }
  private def calc(numBottles: Int, numExchange: Int, numNone: Int, numTotal: Int): Int = {
    (numBottles > 0, numNone >= numExchange) match {
      case (false, false) => numTotal
      case (_,     _)     => {
        val _numNone    = numNone + numBottles
        val _numTotal   = numTotal + numBottles
        val _numBottles = _numNone / numExchange
        calc(_numBottles, numExchange, _numNone % numExchange, _numTotal)
      }
    }
  }
}
