package easy

// Result
// https://leetcode.com/submissions/detail/473693561/
object KidsWithTheGreatestNumberOfCandies {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val max = candies.max
    candies.map(_ + extraCandies >= max)
  }
}
