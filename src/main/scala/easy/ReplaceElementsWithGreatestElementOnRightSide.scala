package easy

// Result
// https://leetcode.com/submissions/detail/474192182/
object ReplaceElementsWithGreatestElementOnRightSide {
  def replaceElements(arr: Array[Int]): Array[Int] = {
    var _max = -1
    for (i <- arr.length - 1 to 0 by -1) {
      val a = arr(i)
      arr(i) = _max
      _max = Math.max(_max, a)
    }
    arr
  }
}
