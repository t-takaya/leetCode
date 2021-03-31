package easy

// Result
// https://leetcode.com/submissions/detail/474655440/
object MaximumAscendingSubarraySum {
  def maxAscendingSum(nums: Array[Int]): Int = {
    var _base = nums.head
    var _num  = nums.head
    (1 until nums.length).map { i =>
      _base = (nums(i - 1) >= nums(i)) match {
        case true  => 0
        case false => _base
      }
      _base += nums(i)
      _num = math.max(_num, _base)
      _num
    }.lastOption.getOrElse(_num)
  }
}
