package easy

// Result
// https://leetcode.com/submissions/detail/474199188/
object DIStringMatch {
  def diStringMatch(S: String): Array[Int] = {
    var _indx = 0
    var _len  = S.length
    val arr   = Array.fill(S.length)(0)
    S.indices.foreach { indice =>
      (S(indice) == 'I') match {
        case true  => {
          arr(indice) = _indx
          _indx += 1
        }
        case false => {
          arr(indice) = _len
          _len -= 1
        }
      }
    }
    arr :+ _indx
  }

  val nums: Array[Int] = Array.empty
  val g = nums.sorted.grouped(2)
  print(g)
  g.map(_.min).sum
}
