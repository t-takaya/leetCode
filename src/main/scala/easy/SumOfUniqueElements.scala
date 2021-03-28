package easy

// Result
// https://leetcode.com/problems/sum-of-unique-elements/
object SumOfUniqueElements {
  def sumOfUnique(nums: Array[Int]): Int = {
    nums.groupBy(identity).mapValues(_.size).filter(_._2 <= 1).map(_._1).sum
  }
}
