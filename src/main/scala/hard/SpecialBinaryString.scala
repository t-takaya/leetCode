package hard

// Result
// https://leetcode.com/submissions/detail/472661363/
object SpecialBinaryString {
  def makeLargestSpecial(S: String): String = {
    if (S.length <= 2) {
      return S
    }
    var _begin = 0
    var _count = 0
    import scala.collection.mutable.ArrayBuffer
    val arrBuffer = ArrayBuffer.empty[String]
    val sToChar   = S.toCharArray()
    (0 until S.length).foreach { i =>
      sToChar(i)  match {
        case c if c == '1' => {
          _count = _count + 1
        }
        case _ if (_count > 0) => {
          _count = _count - 1
          if (_count == 0) {
            arrBuffer += s"1${makeLargestSpecial(S.substring(_begin + 1, i))}0"
            _begin = i + 1
          }
        }
      }
    }
    arrBuffer.sortWith((x, y) =>
      x.compareTo(y) > 0
    ).mkString("")
  }
}
