package easy

// Result
// https://leetcode.com/submissions/detail/274261241/
object DesignHashMap {
  class MyHashMap() {

    /** Initialize your data structure here. */
    import scala.collection.mutable
    private val hashMap = mutable.Map.empty[Int, Int]


    /** value will always be non-negative. */
    def put(key: Int, value: Int) {
      hashMap(key) = value
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    def get(key: Int): Int = {
      hashMap.getOrElse(key, -1)
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    def remove(key: Int) {
      hashMap.remove(key)
    }

  }

  /**
    * Your MyHashMap object will be instantiated and called as such:
    * var obj = new MyHashMap()
    * obj.put(key,value)
    * var param_2 = obj.get(key)
    * obj.remove(key)
    */
}