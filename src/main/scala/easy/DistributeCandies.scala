package easy

// Result
// https://leetcode.com/submissions/detail/474217396/
object DistributeCandies {
  def distributeCandies(candyType: Array[Int]): Int = {
    val distinct = candyType.toSet.size
    val halfLen  = (candyType.length / 2)
    math.min(distinct, halfLen)
  }
}
