package medium

// Result
// https://leetcode.com/submissions/detail/474274831/
object BattleshipsInABoard {
  def countBattleships(board: Array[Array[Char]]): Int = {
    (for {
      i <- 0 until board.length
      j <- 0 until board(i).length
    } yield {
      val isAddShips = {
        (            board(i)(j)     == 'X') &&
          (i == 0 || board(i - 1)(j) != 'X') &&
          (j == 0 || board(i)(j - 1) != 'X')
      }
      isAddShips match {
        case true  => 1
        case false => 0
      }
    }).sum
  }
}
