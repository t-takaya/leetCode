package easy

// Result
// https://leetcode.com/submissions/detail/474133294/
object SumOfAllOddLengthSubarrays {
  def sumOddLengthSubarrays(arr: Array[Int]): Int = {
    (1 to arr.length by 2).map { i =>
      val repeat = arr.length - i + 1
      (0 until repeat).map { r =>
        arr.slice(r, r + i).sum
      }.sum
    }.sum
  }
}
