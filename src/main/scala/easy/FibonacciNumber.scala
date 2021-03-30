package easy

// Result
// https://leetcode.com/submissions/detail/474213180/
object FibonacciNumber {
  def fib(n: Int): Int = {
    calc(n, 0, 1)
  }

  def calc(n: Int, x: Int, y: Int): Int = {
    if (n > 0) {
      calc(n - 1, y, (x + y))
    } else {
      x
    }
  }
}
