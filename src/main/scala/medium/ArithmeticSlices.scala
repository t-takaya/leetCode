package medium

// Result
// https://leetcode.com/submissions/detail/474598151/
object ArithmeticSlices {
  def numberOfArithmeticSlices(nums: Array[Int]): Int = {
    var _num = 0
    var _pre = 0
    import scala.collection.mutable.ArrayBuffer
    val arrBuffer = ArrayBuffer.empty[Int]
    (2 until nums.length).map { i =>
      (nums(i) - nums(i-1) == nums(i-1) - nums(i-2)) match {
        case true  => {
          arrBuffer += i
          if (!arrBuffer.contains(i - 1)) {
            _pre = 0
          }
          _num = _pre + 1
          _pre = _num
          _num
        }
        case false => 0
      }
    }.sum
  }
}
