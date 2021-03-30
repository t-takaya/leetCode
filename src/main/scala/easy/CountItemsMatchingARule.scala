package easy

// Result
// https://leetcode.com/submissions/detail/474115831/
object CountItemsMatchingARule {
  val ruleKeys = List("type", "color", "name")
  def countMatches(items: List[List[String]], ruleKey: String, ruleValue: String): Int = {
    val index = ruleKeys.indexOf(ruleKey)
    items.count(i => i(index) == ruleValue)
  }
}
