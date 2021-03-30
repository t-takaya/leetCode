package easy

// Result
// https://leetcode.com/submissions/detail/474113563/
object NumberOfStepsToReduceANumberToZero {
  def numberOfSteps (num: Int): Int = {
    calc(num, 0)
  }

  private def calc (num: Int, count: Int): Int = {
    if (num <= 0) return count
    val next = num % 2 == 0 match {
      case true  => num / 2
      case false => num - 1
    }
    calc(next, count + 1)
  }
}
