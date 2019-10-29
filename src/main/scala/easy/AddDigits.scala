package easy

// Result
// https://leetcode.com/submissions/detail/274267563/
object AddDigits {
  def addDigits(num: Int): Int = {
    if(num < 10){
      return num
    }

    val nums = num.toString.toList
    val digit = nums.map(_.toString.toInt).sum
    addDigits(digit)
  }
}
