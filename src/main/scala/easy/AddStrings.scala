package easy

// Result
// https://leetcode.com/submissions/detail/275510451/
object AddStrings {
  def addStrings(num1: String, num2: String): String = {
    val num1List = padLeftZeroList(num1, num2)
    val num2List = padLeftZeroList(num2, num1)

    val numSumList = num1List.zipWithIndex.map { case (v, i) =>
      v.toInt + num2List(i).toInt
    }.reverse.map(_.toString)

    var isCountUp = false
    numSumList.zipWithIndex.foldLeft(""){(acc, v) =>
      val index = v._2
      val add   = if(isCountUp){1}else{0}
      val value = (v._1.toInt + add).toString

      if(index < numSumList.length - 1){
        isCountUp = value.toInt >= 10
        acc + value.takeRight(1)
      }else{
        acc + value.reverse
      }
    }.reverse
  }

  private def padLeftZeroList(value: String, target: String): List[String] = {
    val diff = target.length - value.length
    val padLeftZeroString = if(diff > 0){
      val padLeft = s"%${target.length}s"
      padLeft.format(value).replace(" ", "0")
    }else{
      value
    }
    padLeftZeroString.toList.map(_.toString)
  }
}
