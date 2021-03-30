package easy

// Result
// https://leetcode.com/submissions/detail/474210931/
object FindCommonCharacters {
  def commonChars(A: Array[String]): List[String] = {
    val itst = A.reduce(_ intersect _)
    itst.toCharArray.map(_.toString).toList
  }
}
