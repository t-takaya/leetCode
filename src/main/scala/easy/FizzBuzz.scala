package easy

// Result
// https://leetcode.com/submissions/detail/274251398/
object FizzBuzz {
  def fizzBuzz(n: Int): List[String] = {
    (1 to n).map { x =>
      x match {
        case x if x % 15 == 0 => "FizzBuzz"
        case x if x % 3 == 0 => "Fizz"
        case x if x % 5 == 0 => "Buzz"
        case _ => x.toString
      }
    }.toList
  }
}
