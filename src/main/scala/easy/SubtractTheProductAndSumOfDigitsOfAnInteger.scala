package easy

// Result
// https://leetcode.com/submissions/detail/473321849/
object SubtractTheProductAndSumOfDigitsOfAnInteger {
  def subtractProductAndSum(n: Int): Int = {
    val nc = n.toString.toCharArray.map(_.toString.toInt)
    nc.foldLeft(1)(_ * _) - nc.sum
  }
}
