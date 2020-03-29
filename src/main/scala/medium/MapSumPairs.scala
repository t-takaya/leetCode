package medium

// Result
// https://leetcode.com/submissions/detail/314854484/
class MapSumPairs() {

  /** Initialize your data structure here. */
  val numMap = scala.collection.mutable.Map.empty[String, Int]

  def insert(key: String, `val`: Int) {
    numMap += (key -> `val`)
  }

  def sum(prefix: String): Int = {
    numMap.filter(n => n._1.startsWith(prefix)).values.sum
  }

}

/**
  * Your MapSum object will be instantiated and called as such:
  * var obj = new MapSum()
  * obj.insert(key,`val`)
  * var param_2 = obj.sum(prefix)
  */