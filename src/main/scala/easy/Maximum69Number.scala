package easy

// Result
// https://leetcode.com/submissions/detail/473347119/
object Maximum69Number {
  def maximum69Number (num: Int): Int = {
    val nums = num.toString.toCharArray.map(_.toString)
    ((0 until num.toString.length).map{ index =>
      nums.zipWithIndex.map{ case(n,i) =>
        (index == i,nums(index)) match {
          case (true, "9") => "6"
          case (true, "6") => "9"
          case (_   ,  _ ) =>  n
        }
      }.mkString("").toInt
    } :+ num).max
  }
}
