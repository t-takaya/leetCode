package easy

// Result
// https://leetcode.com/submissions/detail/474201953/
object HeightChecker {
  def heightChecker(heights: Array[Int]): Int = {
    val zh  = heights.sorted zip heights
    val fzh = zh.filter(v => v._1 != v._2)
    fzh.length
  }
}
