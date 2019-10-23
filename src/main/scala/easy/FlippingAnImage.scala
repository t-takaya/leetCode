package easy

// Result
// https://leetcode.com/submissions/detail/272552882/
object FlippingAnImage {
  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
    A.map(_.reverse.map(_ ^ 1))
  }
}
