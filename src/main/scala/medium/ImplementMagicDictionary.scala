package medium

// Result
// https://leetcode.com/submissions/detail/315530005/
class ImplementMagicDictionary {

  /** Initialize your data structure here. */
  val dictSet = scala.collection.mutable.Set.empty[String]

  /** Build a dictionary through a list of words */
  def buildDict(dict: Array[String]) {
    dictSet ++= dict.toSet
  }

  /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
  def search(word: String): Boolean = {
    dictSet.exists { dict =>
      val wordSameCount = dict.toCharArray.zipWithIndex.map { case(d, i) =>
        word.slice(i, i + 1) == d.toString
      }.count(b => b) + 1

      wordSameCount == dict.length && word.length == dict.length
    }
  }

}

/**
  * Your MagicDictionary object will be instantiated and called as such:
  * var obj = new MagicDictionary()
  * obj.buildDict(dict)
  * var param_2 = obj.search(word)
  */