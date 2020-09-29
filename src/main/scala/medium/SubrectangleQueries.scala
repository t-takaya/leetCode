package medium

// Result
// https://leetcode.com/submissions/detail/402263068/
class SubrectangleQueries(_rectangle: Array[Array[Int]]) {
  var rectangle = _rectangle

  def updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
    for {
      row <- row1 to row2
      col <- col1 to col2
    } rectangle(row)(col) = newValue
  }

  def getValue(row: Int, col: Int): Int = {
    rectangle(row)(col)
  }
}

/**
  * Your SubrectangleQueries object will be instantiated and called as such:
  * var obj = new SubrectangleQueries(rectangle)
  * obj.updateSubrectangle(row1,col1,row2,col2,newValue)
  * var param_2 = obj.getValue(row,col)
  */