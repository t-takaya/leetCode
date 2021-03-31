package easy

// Result
// https://leetcode.com/submissions/detail/474658684/
object RelativeSortArray {
  Int.MaxValue
  def relativeSortArray(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    val base = 1000
    val nums = Array.ofDim[Int](base + 1)
    val rets = Array.ofDim[Int](arr1.length)
    var _num = 0
    arr1.foreach { a =>
      nums(a) += 1
    }
    arr2.foreach { a =>
      (0 until nums(a)).foreach { i =>
        rets(_num) = a
        _num += 1
        nums(a) = 0
      }
    }
    (0 to base).foreach { i =>
      (0 until nums(i)).foreach { _ =>
        rets(_num) = i
        _num += 1
      }
    }
    rets
  }
}
