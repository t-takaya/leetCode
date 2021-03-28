package medium

object QueensThatCanAttackTheKing {
  def queensAttacktheKing(queens: Array[Array[Int]], king: Array[Int]): List[List[Int]] = {
    val set = queens.map( queen =>
      queen.head * 16 + queen.tail.head
      ).toSet
    println(set)
    (for {
      i <- -1 to 1
      j <- -1 to 1
      k <-  1 to 7
    } yield {
      val rr = king.head + i * k
      val rc = king.tail.head + j * k
      set.contains(rr * 16 + rc) match {
        case true  => List(rr, rc)
        case false => Nil
      }
    }).toList.filter(_.length > 0).zipWithIndex.filter { case(_, i) =>
      i % 2 == 0
    }.map(_._1)
  }

  def main(args: Array[String]): Unit = {
    val l = queensAttacktheKing(
      Array(Array(0,1),Array(1,0),Array(4,0),Array(0,4),Array(3,3),Array(2,4)),
        Array(0,0))
    println(l);
  }
}
