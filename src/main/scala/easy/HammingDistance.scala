package easy

// Result
// https://leetcode.com/submissions/detail/272866403/
object HammingDistance {
  def hammingDistance(x: Int, y: Int): Int = {
    val padLeftFormat = "%32s"
    val xBinaryList = padLeftFormat.format(x.toBinaryString).replace(" ", "0").toList
    val yBinaryList = padLeftFormat.format(y.toBinaryString).replace(" ", "0").toList

    val hammingDistance = xBinaryList.zipWithIndex.map { case (x, i) =>
      x != yBinaryList(i)
    }.filter(x => x).length
    hammingDistance
  }
}
