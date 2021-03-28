package hard

// Result
// https://leetcode.com/submissions/detail/472652312/
object CherryPickupII {
  def cherryPickup(grid: Array[Array[Int]]): Int = {
    val row    = grid.length
    val col    = grid.head.length
    val pbs    = Array(
      Array(1, -1), Array(0, -1), Array(-1, -1), Array(1, 0),
      Array(0,  0), Array(-1, 0), Array(1,   1), Array(0, 1),
      Array(-1, 1)
    )
    var _picks = new Array[Int](col).map(_ =>
      new Array[Int](col)
    )
    ((row -1) to 0 by -1).foreach { i =>
      val nows = new Array[Int](col).map(_ => new Array[Int](col))
      val min = (i >= col) match {
        case true  => 0
        case false => (col - i - 1)
      }
      val max = (i >= col) match {
        case true  => (col - 1)
        case false => i
      }
      (0 to max).foreach { ri =>
        ((col -1) to min by -1).foreach { ci =>
          pbs.foreach { pb =>
            val br = ri + pb(0)
            val bc = ci + pb(1)
            if (br >= 0 && br < col && bc >= 0 && bc < col) {
              nows(ri)(ci) = Math.max(nows(ri)(ci), _picks(br)(bc))
              print(nows(ri)(ci))
            }
          }
          println()
          nows(ri)(ci) += (grid(i)(ri) + (ri != ci match {
            case true  => grid(i)(ci)
            case false => 0
          }))
        }
      }
      _picks = nows
    }
    _picks.head(col - 1)
  }
}
