package easy

// Result
// https://leetcode.com/problems/reverse-integer/submissions/
object ReverseInteger {
  def reverse(x: Int): Int = {
    val abs = math.abs(x.toLong)
    val reverse = abs.toString.reverse.toLong
    if(reverse > Int.MaxValue){
      return 0
    }

    if(x < 0){
      -reverse.toInt
    }else{
      reverse.toInt
    }
  }
}
