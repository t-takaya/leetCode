package easy

// Result
// https://leetcode.com/submissions/detail/474166430/
object SelfDividingNumbers {
  def selfDividingNumbers(left: Int, right: Int): List[Int] = {
    val arr = {
      for (i <- left to right
           if i.toString.toCharArray.map(_ - '0')
             .forall(x => x != 0 && i % x == 0)
           ) yield i
    }
    arr.toList
  }
}
