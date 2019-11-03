package easy

// Result
// https://leetcode.com/submissions/detail/275595120/
object GoatLatin {
  def toGoatLatin(S: String): String = {
    val suffix = "ma"
    val vowels = Seq("a","i","u","e","o")

    val SList = S.split(" ")
    SList.zipWithIndex.map { case(v, i) =>
      val value = if(vowels.exists(v.toLowerCase.startsWith(_))){
        v + suffix
      }else{
        v.tail + v.head + suffix
      }

      value + ("a" * (i + 1))
    }.mkString(" ")
  }
}
