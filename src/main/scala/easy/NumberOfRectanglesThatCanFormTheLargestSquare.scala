package easy

// Result
// https://leetcode.com/submissions/detail/473710142/
object NumberOfRectanglesThatCanFormTheLargestSquare {
  def countGoodRectangles(rectangles: Array[Array[Int]]): Int = {
    val max = rectangles.map(r => r.min).max
    rectangles.count(r => r.forall(_ >= max))
  }
}
