package medium

// Result
// https://leetcode.com/submissions/detail/474509757/
object MinimumNumberOfStepsToMakeTwoStringsAnagram {
  def minSteps(s: String, t: String): Int = {
    import scala.collection.mutable.Map
    val cmap = Map.empty[Char,Int]
    t.foreach(t => cmap.put(t, cmap.getOrElse(t, 0) + 1))
    s.foreach(s => cmap.put(s, cmap.getOrElse(s, 0) - 1))
    cmap.map { case(key, value) =>
      math.abs(value)
    }.sum / 2
  }
}
