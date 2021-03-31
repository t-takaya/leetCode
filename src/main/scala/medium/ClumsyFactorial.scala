package medium

// Result
// https://leetcode.com/submissions/detail/474626823/
object ClumsyFactorial {
  def clumsy(N: Int): Int = {
    val clumap = Map(1 -> 1, 2 -> 2, 3 -> 6, 4 -> 7)
    clumap.get(N).getOrElse {
      (N % 4) match {
        case n if n == 0 => N + 1
        case n if n == 3 => N - 1
        case _           => N + 2
      }
    }
  }
}
