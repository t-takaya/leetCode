package medium

// Result
// https://leetcode.com/submissions/detail/474514136/
object CountingBits {
  def countBits(num: Int): Array[Int] = {
    val counts = (0 to num).map(count(_))
    counts.map(_.sum).toArray
  }

  private def count(num: Int): Array[Int] = {
    num.toBinaryString.map(_.toString.toInt).toArray
  }
}
