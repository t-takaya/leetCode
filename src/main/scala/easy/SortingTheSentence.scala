package easy

// Result
// https://leetcode.com/submissions/detail/547243931/
object SortingTheSentence {
  def sortSentence(s: String): String = {
    val sortSentence = new Array[String](s.split(" ").length)
    for (st <- s.split(" ")) {
      sortSentence(st.charAt(st.length - 1) - '1') = st.init
    }
    sortSentence.mkString(" ")
  }
}
