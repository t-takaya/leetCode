package hard

object BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {
  val MOD = 1000000007
  def numOfArrays(n: Int, m: Int, k: Int): Int = {
    val arr = Array.ofDim[Integer](n + 1, m + 1, k + 1)
    calc(arr, 0, n, m, 0, k, 0) % MOD
  }
  def sumOfUnique(nums: Array[Int]): Int = {
    nums.groupBy(identity).mapValues(_.size).filter(_._2 <= 2).map(_._1).sum
  }
  private def calc(arr: Array[Array[Array[Integer]]], start: Int, n: Int, m: Int, nowK: Int, k: Int, max: Int): Int = {
    if (start == n) {
      return (nowK == k match {
        case true  => 1
        case false => 0
      })
    }
    if (nowK > k) {
      return 0
    }

    val exist = {
      arr.length > start &&
      arr(start).length > nowK &&
      arr(start)(nowK).length > max
    }
    if (exist && arr(start)(nowK)(max) != null) {
      return arr(start)(nowK)(max)
    }

    var _clcResult = 0
    (1 to m).foreach { i =>
      val _nowK = (i > max) match {
        case true  => nowK + 1
        case false => nowK
      }
      _clcResult = {
        (_clcResult + {
          val r = calc(arr, start + 1, n, m, _nowK, k, Math.max(max, i))
          r % MOD
        }) % MOD
      }
    }
    if (exist && arr(start)(nowK)(max) != null) {
      arr(start)(nowK)(max) = _clcResult
    }
    _clcResult
  }
}
