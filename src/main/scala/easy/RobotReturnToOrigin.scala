package easy

// Result
// https://leetcode.com/submissions/detail/474196578/
object RobotReturnToOrigin {
  def judgeCircle(moves: String): Boolean = {
    val sameCntLR = moves.toCharArray.count(_ == 'L') == moves.toCharArray.count(_ == 'R')
    val sameCntUD = moves.toCharArray.count(_ == 'U') == moves.toCharArray.count(_ == 'D')
    sameCntLR && sameCntUD
  }
}
