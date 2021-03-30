package easy

// Result
// https://leetcode.com/submissions/detail/474120677/
object DecompressRunLengthEncodedList {
  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    val numstpl = (1 to nums.length -1 by 2).map { i =>
      (nums(i - 1), nums(i))
    }
    numstpl.flatMap { n =>
      Seq.fill(n._1)(n._2)
    }.toArray
  }
}
