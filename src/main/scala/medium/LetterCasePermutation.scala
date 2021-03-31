package medium

// Result
// https://leetcode.com/submissions/detail/474540349/
object LetterCasePermutation {
  def letterCasePermutation(S: String): List[String] = {
    import scala.collection.mutable.ArrayBuffer
    val arrBuf   = ArrayBuffer.empty[String]
    val emptyStr = ""
    if (S.isEmpty) {
      arrBuf += emptyStr
      return arrBuf.toList
    }
    val ret  = letterCasePermutation(S.tail)
    val head = S.toLowerCase.head
    ret.foreach { r =>
      arrBuf += emptyStr + head + r
      if (head >='a' && head <='z') {
        val char = (head +'A'-'a').toChar
        arrBuf += emptyStr + char + r
      }
    }
    arrBuf.toList
  }
}
