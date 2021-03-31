package medium

// Result
// https://leetcode.com/submissions/detail/474609342/
object _4SumII {
  def fourSumCount(A: Array[Int], B: Array[Int], C: Array[Int], D: Array[Int]): Int = {
    val abmap = A.flatMap{ a =>
      B.map(_ + a)
    }.groupBy(a => a)
     .mapValues(_.length)
    val cdarr = C.flatMap{ c =>
      D.map(d => abmap.getOrElse(- c - d, 0))
    }
    cdarr.sum
  }
}
