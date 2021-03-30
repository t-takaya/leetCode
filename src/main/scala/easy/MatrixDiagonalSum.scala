package easy

// Result
// https://leetcode.com/submissions/detail/473339693/
object MatrixDiagonalSum {
  def maximum69Number (num: Int): Int = {
    val nums = num.toString.toCharArray.map(_.toString)
    ((0 until num.toString.length).map{ index =>
      val v = nums.zipWithIndex.map{ case(n,i) =>
        (index == i,nums(index)) match {
          case (true, "9") => "6"
          case (true, "6") => "9"
          case (_   ,  _ ) =>  n
        }
      }.mkString("").toInt
      println(v)
      v
    }).max
  }
}
