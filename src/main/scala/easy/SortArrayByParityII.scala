package easy

// Result
// https://leetcode.com/submissions/detail/473095131/
object SortArrayByParityII {
  def sortArrayByParityII(nums: Array[Int]): Array[Int] = {
    (nums.filter(_ % 2 == 0) zip nums.filterNot(_ % 2 == 0))
      .flatMap(n => Array(n._1, n._2))
  }
}
