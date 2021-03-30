package easy

// Result
// https://leetcode.com/submissions/detail/474185932/
object MergeTwoBinaryTrees {
  def mergeTrees(root1: TreeNode, root2: TreeNode): TreeNode = {
    val rootOpt1 = Option(root1)
    val rootOpt2 = Option(root2)
    (rootOpt1, rootOpt2) match {
      case (None,     None)     => null
      case (Some(r),  None)     => r
      case (None,     Some(r))  => r
      case (Some(r1), Some(r2)) => {
        val l = mergeTrees(r1.left,  r2.left)
        val r = mergeTrees(r1.right, r2.right)
        new TreeNode(r1.value + r2.value, l, r)
      }
    }
  }
  //Definition for a binary tree node.
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }
}
