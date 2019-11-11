package medium

// Result
// https://leetcode.com/submissions/detail/277909667/
object AddTwoNumbers {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val reversNumbers1 = getNumbers(l1).reverse
    val reversNumbers2 = getNumbers(l2).reverse

    val reverseStringNumbers1 = padLeftZeroList(reversNumbers1.mkString, reversNumbers2.mkString)
    val reverseStringNumbers2 = padLeftZeroList(reversNumbers2.mkString, reversNumbers1.mkString)

    val reverseTotal = sumNumList(reverseStringNumbers1, reverseStringNumbers2)
    val reverseNumbers = reverseTotal.toList.map(_.toString.toInt)

    val listNode = new ListNode(reverseNumbers.last)
    createListNode(reverseNumbers.init, listNode)
  }

  private def getNumbers(ln: ListNode, numbers: Seq[Int] = Seq.empty): Seq[Int] ={
    val nextListNode = ln.next
    val nextNumbers = numbers :+ ln.x
    if(nextListNode == null) {
      nextNumbers
    } else {
      getNumbers(nextListNode, nextNumbers)
    }
  }

  private def createListNode(numbers: Seq[Int], ln: ListNode): ListNode = {
    if(numbers.isEmpty) {
      ln
    }else{
      val preln = new ListNode(numbers.last)
      preln.next = ln
      createListNode(numbers.init, preln)
    }
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

  private def sumNumList(num1List: List[String], num2List: List[String]) = {
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
    }
  }
}

// Definition for singly-linked list.
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
