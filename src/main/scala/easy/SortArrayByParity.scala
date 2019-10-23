package easy

// Result
// https://leetcode.com/submissions/detail/272564741/
object SortArrayByParity {
  def sortArrayByParity(A: Array[Int]): Array[Int] = {
    A.sortBy(_ % 2)
  }
}
