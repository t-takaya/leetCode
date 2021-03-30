package medium

// Result
// https://leetcode.com/submissions/detail/474257518/
object AllPathsFromSourceToTarget {
  def allPathsSourceTarget(graph: Array[Array[Int]]): List[List[Int]] = {
    create(graph, 0, graph.length - 1)
  }

  private def create(graph: Array[Array[Int]], from: Int, to: Int): List[List[Int]] = {
    (from == to) match {
      case true  => List(List(to))
      case false => (for {
        i <- graph(from)
        j <- create(graph, i, to)
      } yield {
        from :: j
      }).toList
    }
  }
}
