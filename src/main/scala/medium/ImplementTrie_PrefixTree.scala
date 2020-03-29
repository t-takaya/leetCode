package medium

// Result
// https://leetcode.com/submissions/detail/314856078/
class ImplementTrie_PrefixTree() {

  /** Initialize your data structure here. */
  val trieSet = scala.collection.mutable.Set.empty[String]

  /** Inserts a word into the trie. */
  def insert(word: String) {
    trieSet += word
  }

  /** Returns if the word is in the trie. */
  def search(word: String): Boolean = {
    trieSet.contains(word)
  }

  /** Returns if there is any word in the trie that starts with the given prefix. */
  def startsWith(prefix: String): Boolean = {
    trieSet.exists(_.startsWith(prefix))
  }

}

/**
  * Your Trie object will be instantiated and called as such:
  * var obj = new Trie()
  * obj.insert(word)
  * var param_2 = obj.search(word)
  * var param_3 = obj.startsWith(prefix)
  */