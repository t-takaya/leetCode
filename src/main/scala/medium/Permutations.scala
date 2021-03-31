package medium

// Result
// https://leetcode.com/submissions/detail/474520720/
object Permutations {
  def permute(nums: Array[Int]): List[List[Int]] = {
    val ret = calc(nums.distinct.toSet)
    ret.toList
  }

  private def calc(nums: Set[Int]): Set[List[Int]] = {
    (nums.nonEmpty) match {
      case true  => nums.flatMap { num =>
        val nexts = nums - num
        calc(nexts).map(next => num :: next)
      }
      case false => {
        val emptyList = List.empty[Int]
        Set(emptyList)
      }
    }
  }
}
