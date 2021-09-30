package medium

// Result
// https://leetcode.com/submissions/detail/563473080/
object IncrementalMemoryLeak {
  def memLeak(memory1: Int, memory2: Int): Array[Int] = {
    createMemLeaks(memory1, memory2, 1)
  }

  private def createMemLeaks(memory1: Int, memory2: Int, count: Int): Array[Int] = {
    (count <= memory1 || count <= memory2) match {
      case true  => {
        val (resetMem1, resetMem2) = if (memory1 < memory2) {
          (memory1, memory2 - count)
        } else {
          (memory1 - count, memory2)
        }
        createMemLeaks(resetMem1, resetMem2, count + 1)
      }
      case false => Array(count, memory1, memory2)
    }
  }
}
