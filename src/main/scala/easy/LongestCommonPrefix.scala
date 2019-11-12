package easy

// Result
// https://leetcode.com/submissions/detail/278217011/
object LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    getCommonPrefix(strs, strs.headOption.getOrElse(""))
  }
  def getCommonPrefix(values: Array[String], prefix: String): String = {
    if(prefix.isEmpty){
      return ""
    }
    if(!values.forall(_.startsWith(prefix))){
      getCommonPrefix(values, prefix.init)
    }else{
      prefix
    }
  }
}
