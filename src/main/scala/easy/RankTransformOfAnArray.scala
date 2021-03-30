package easy

// Result
// https://leetcode.com/submissions/detail/474230308/
object RankTransformOfAnArray {
  def arrayRankTransform(arr: Array[Int]): Array[Int] = {
    val rankMap = arr.sorted.distinct.zipWithIndex.toMap
    arr.map(a => rankMap(a) + 1)
  }
}
