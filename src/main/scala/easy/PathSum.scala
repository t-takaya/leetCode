package easy

// Result
// https://leetcode.com/submissions/detail/473098818/
object PathSum {
  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    if (root == null) {
      false
    } else {
      root match {
        case r if r.left == null && r.right == null => r.value == targetSum
        case r => hasPathSum(r.left, targetSum - r.value) || hasPathSum(r.right, targetSum - r.value)
      }
    }
  }
}
// Definition for a binary tree node.
class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}
