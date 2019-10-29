package easy

// Result
// https://leetcode.com/submissions/detail/274263772/
object DesignHashSet {
  class MyHashSet() {

    /** Initialize your data structure here. */
    import scala.collection.mutable
    private val hashSet = mutable.Set.empty[Int]


    def add(key: Int) {
      hashSet.add(key)
    }

    def remove(key: Int) {
      hashSet.remove(key)
    }

    /** Returns true if this set contains the specified element */
    def contains(key: Int): Boolean = {
      hashSet.contains(key)
    }

  }

  /**
    * Your MyHashSet object will be instantiated and called as such:
    * var obj = new MyHashSet()
    * obj.add(key)
    * obj.remove(key)
    * var param_3 = obj.contains(key)
    */
}