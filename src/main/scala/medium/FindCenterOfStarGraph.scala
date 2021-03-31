package medium

// Result
// https://leetcode.com/submissions/detail/474628845/
object FindCenterOfStarGraph {
  def findCenter(edges: Array[Array[Int]]): Int = {
    val ff = edges.head.head
    val sf = edges.tail.head.head
    val fs = edges.head.tail.head
    val ss = edges.tail.head.tail.head
    (ff == sf || ff == ss) match {
      case true  => ff
      case false => fs
    }
  }
}
