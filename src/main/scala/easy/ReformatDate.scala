package easy

// Result
// https://leetcode.com/submissions/detail/473366848/
object ReformatDate {
  def reformatDate(date: String): String = {
    val mlist = List("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
    val dlist = date.split(" ").reverse
    dlist.zipWithIndex.map { case(d, i) =>
      i match {
        case 1 => "%02d".format(mlist.indexWhere(_ == d) + 1)
        case 2 => "%02d".format(d.init.init.toInt)
        case _ => d
      }
    }.mkString("-")
  }
}
