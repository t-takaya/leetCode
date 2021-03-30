package easy

// Result
// https://leetcode.com/submissions/detail/474170136/
object CountGoodTriplets {
  def countGoodTriplets(arr: Array[Int], a: Int, b: Int, c: Int): Int = {
    val triplets = for {
      i <- (0 to arr.length - 2)
      j <- (1 to arr.length - 2)
      k <- arr.drop(i + j + 1)
    } yield {
      Array(arr(i), arr(i + j), k)
    }
    triplets.count { t =>
      (t(0) - t(1)).abs <= a &&
        (t(1) - t(2)).abs <= b &&
        (t(0) - t(2)).abs <= c
    }
  }
}
