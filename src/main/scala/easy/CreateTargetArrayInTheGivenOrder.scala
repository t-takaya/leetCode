package easy

// Result
// https://leetcode.com/submissions/detail/473705806/
object CreateTargetArrayInTheGivenOrder {
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    import scala.collection.mutable.ArrayBuffer
    val arrBuffer = ArrayBuffer.empty[Int]
    nums.zipWithIndex.foreach { case(n, i) =>
      arrBuffer.insert(index(i), n)
    }
    arrBuffer.toArray
  }
}
