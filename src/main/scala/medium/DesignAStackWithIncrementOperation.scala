package medium

// Result
// https://leetcode.com/submissions/detail/474267073/
object DesignAStackWithIncrementOperation {
  class CustomStack(_maxSize: Int) {
    import scala.collection.mutable.Stack
    var stack = Stack[Int]()

    def push(x: Int) {
      if (stack.length < _maxSize) {
        stack.push(x)
      }
    }

    def pop(): Int = {
      stack.length > 0 match {
        case true  => stack.pop
        case false => -1
      }
    }

    def increment(k: Int, `val`: Int) {
      val stackTmp = stack.reverse
      (0 until math.min(k,stack.length)).foreach { i =>
        stackTmp(i) +=`val`
      }
      stack = stackTmp.reverse
    }
  }
  /**
    * Your CustomStack object will be instantiated and called as such:
    * var obj = new CustomStack(maxSize)
    * obj.push(x)
    * var param_2 = obj.pop()
    * obj.increment(k,`val`)
    */
}
