package medium

// Result
// https://leetcode.com/submissions/detail/402267625/
object SubmissionDetail {
  def constructMaximumBinaryTree(nums: Array[Int]): TreeNode = {
    createTreeNode(nums, 0, nums.length)
  }

  private def createTreeNode(nums: Array[Int], left: Int, right: Int): TreeNode = {
    (left >= right) match {
      case true  => null
      case false => {
        val max = (left until right) maxBy nums
        val tree = new TreeNode(nums(max))
        tree.left = createTreeNode(nums, left, max)
        tree.right = createTreeNode(nums, max + 1, right)
        tree
      }
    }
  }

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }
}
