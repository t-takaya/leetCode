package easy

// Result
// https://leetcode.com/submissions/detail/277274773/
object TwoSumII_InputArrayIsSorted {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    val start = math.min(numbers.min, 0)
    val twoSumTuples = (start to target).map { case i =>
      (i, target - i)
    }.toList

    val twoSumIndexTuple = twoSumTuples.map { case(num1, num2) =>
      (numbers.indexWhere(_ == num1) + 1, numbers.lastIndexWhere(_ == num2) + 1)
    }.filter { case(num1, num2) => num1 > 0 && num2 > 0 }.head

    Array(twoSumIndexTuple._1, twoSumIndexTuple._2)
  }
}
