package easy

// Result
// https://leetcode.com/submissions/detail/473352473/
object AverageSalaryExcludingTheMinimumAndMaximumSalary {
  def average(salary: Array[Int]): Double = {
    val min = salary.min
    val max = salary.max
    val fc  = salary.filterNot(_ == min).filterNot(_ == max)
    (fc.sum.toDouble / fc.length.toDouble).toDouble
  }
}
