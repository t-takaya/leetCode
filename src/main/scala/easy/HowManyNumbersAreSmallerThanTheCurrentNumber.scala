package easy

// Result
// https://leetcode.com/submissions/detail/474105271/
object HowManyNumbersAreSmallerThanTheCurrentNumber {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    nums.map(n => nums.filterNot(_ == n).count(_ < n))
  }
}
