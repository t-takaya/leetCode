package medium

// Result
// https://leetcode.com/submissions/detail/474637381/
object LowestCommonAncestorOfDeepestLeaves {
  def lcaDeepestLeaves(root: TreeNode): TreeNode = {
    Option(root) match {
      case Some(r) if calc(r.left) == calc(r.right) => root
      case _ => {
        val next = if (calc(root.left) > calc(root.right)) {
          root.left
        } else {
          root.right
        }
        lcaDeepestLeaves(next)
      }
    }
  }

  private def calc(root: TreeNode): Int = {
    Option(root) match {
      case Some(r) => {
        math.max(calc(r.left), calc(r.right)) + 1
      }
      case None    => 0
    }
  }

  // Definition for a binary tree node.
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }
}
