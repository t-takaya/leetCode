package easy

// Result
// https://leetcode.com/submissions/detail/473697134/
object ShuffleTheArray {
  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    val sn = nums.splitAt(n)
    (0 until n).flatMap(i => Array(sn._1(i), sn._2(i))).toArray
  }
}
