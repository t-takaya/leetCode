package medium

// Result
// https://leetcode.com/submissions/detail/474547119/
object KeysAndRooms {
  import scala.collection.mutable.Set
  def canVisitAllRooms(rooms: List[List[Int]]): Boolean = {
    val visitSet = Set.empty[Int]
    calc(rooms, visitSet, 0)
    rooms.length == visitSet.size
  }

  private def calc(rooms: List[List[Int]], visitSet:Set[Int], index: Int): Unit = {
    visitSet += index
    rooms(index).foreach { r =>
      if (!visitSet.contains(r)) {
        calc(rooms, visitSet, r)
      }
    }
  }
}
