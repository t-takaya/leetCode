package easy

// Result
// https://leetcode.com/submissions/detail/273965827/
object KeyboardRow {
  def findWords(words: Array[String]): Array[String] = {
    val keyboardRows = Array("QWERTYUIOP",
                             "ASDFGHJKL",
                             "ZXCVBNM")
    keyboardRows.map { k =>
      words.map { w =>
        if(w.forall(x => k.contains(x.toUpper))){
          w
        }else{
          ""
        }
      }.filter(_.length > 0)
    }.flatten
  }
}
