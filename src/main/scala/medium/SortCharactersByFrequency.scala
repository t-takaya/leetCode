package medium

// Result
// https://leetcode.com/submissions/detail/474524986/
object SortCharactersByFrequency {
  def frequencySort(s: String): String = {
    import scala.collection.mutable.Map
    val cmap = Map[Char, Int]()
    s.foreach { _s =>
      val next = cmap.getOrElse(_s, 0) + 1
      cmap.put(_s, next)
    }
    val carr = cmap.toArray.sortWith { (mp1, mp2) =>
      mp1._2 > mp2._2
    }
    carr.map { case (key, value) =>
      key.toString * value
    }.mkString
  }
}
