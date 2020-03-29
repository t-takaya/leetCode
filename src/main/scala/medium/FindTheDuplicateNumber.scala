package medium

// Result
// https://leetcode.com/submissions/detail/315829492/
object FindTheDuplicateNumber {
  def findDuplicate(nums: Array[Int]): Int = {
    nums.groupBy(n => nums.count(_ == n)).maxBy { case (key, _) => key }._2.head
  }
}
