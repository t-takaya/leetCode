package easy

// Result
// https://leetcode.com/submissions/detail/274269653/
object ComplementOfBase10Integer {
  def bitwiseComplement(N: Int): Int = {
    val binaryList = N.toBinaryString.toList.map(_.toString.toInt)
    val complementNum = binaryList.map(_ ^ 1).mkString
    Integer.parseInt(complementNum, 2)
  }
}
