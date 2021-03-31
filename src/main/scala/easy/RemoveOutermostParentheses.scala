package easy

import scala.collection.mutable.ArrayBuffer

// Result
// https://leetcode.com/submissions/detail/474174974/
object RemoveOutermostParentheses {
  def removeOuterParentheses(S: String): String = {
    var _ri = 0
    S.toCharArray.flatMap { s =>
      (s == '(') match {
        case true  => {
          _ri += 1
          if (_ri > 1) {
            Some(s)
          } else {
            None
          }
        }
        case false => {
          _ri -= 1
          if (_ri > 0) {
            Some(s)
          } else {
            None
          }
        }
      }
    }.mkString
  }
}
