package easy

// Result
// https://leetcode.com/submissions/detail/474224625/
object ElementAppearingMoreThan25InSortedArray {
  def findSpecialInteger(arr: Array[Int]): Int = {
    val index = arr.zipWithIndex.map { case(a, i) =>
      (arr.count(_ == a), i)
    }.sortBy(_._1).reverse.head._2
    arr(index)
  }
}
