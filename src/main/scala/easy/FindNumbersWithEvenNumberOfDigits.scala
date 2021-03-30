package easy

// Result
// https://leetcode.com/submissions/detail/473309981/
object FindNumbersWithEvenNumberOfDigits {
  def findNumbers(nums: Array[Int]): Int = {
    nums.map(_.toString.length).filter(_ % 2 == 0).length
  }
}
