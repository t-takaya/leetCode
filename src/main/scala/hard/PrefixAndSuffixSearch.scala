package hard

// Result
// https://leetcode.com/submissions/detail/314873188/
class PrefixAndSuffixSearch(_words: Array[String]) {

  def f(prefix: String, suffix: String): Int = {
    _words.lastIndexWhere(w => w.startsWith(prefix) && w.endsWith(suffix))
  }

}

/**
  * Your WordFilter object will be instantiated and called as such:
  * var obj = new WordFilter(words)
  * var param_1 = obj.f(prefix,suffix)
  */
