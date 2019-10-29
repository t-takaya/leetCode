package easy

// Result
// https://leetcode.com/submissions/detail/274256357/
object NumberComplement {
  def findComplement(num: Int): Int = {
    val binaryList = num.toBinaryString.toList.map(_.toString.toInt)
    val complementNum = binaryList.map(_ ^ 1).mkString
    Integer.parseInt(complementNum, 2)
  }
}
