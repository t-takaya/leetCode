package medium

// Result
// https://leetcode.com/submissions/detail/402270676/
object EncodeAndDecodeTinyURL {
  class Codec {
    import scala.collection.mutable.ListBuffer
    val URLs = ListBuffer[String]()

    // Encodes a URL to a shortened URL.
    def encode(longURL: String): String = {
      URLs.addOne(longURL)
      (URLs.length - 1).toString
    }

    // Decodes a shortened URL to its original URL.
    def decode(shortURL: String): String = {
      val i = shortURL.toInt
      (i < URLs.length) match {
        case true  => URLs(i)
        case false => ""
      }
    }
  }
  /**
    * Your Codec object will be instantiated and called as such:
    * var obj = new Codec()
    * val s = obj.encode(longURL)
    * val ans = obj.decode(s)
    */
}
