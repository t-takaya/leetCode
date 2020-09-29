package medium


// Result
// https://leetcode.com/submissions/detail/401852015/
object DeepestLeavesSum {
  def deepestLeavesSum(root: TreeNode): Int = {
    import scala.collection.mutable.Queue
    import scala.collection.mutable.ListBuffer

    val tree = Queue[(Int, TreeNode)]((0, root))
    val treeList = ListBuffer[(Int, TreeNode)]()

    while (tree.nonEmpty) {
      val (depth, node) = tree.dequeue
      treeList.addOne((depth, node))

      if (node.left != null) {
        tree.enqueue((depth + 1, node.left))
      }
      if (node.right != null) {
        tree.enqueue((depth + 1, node.right))
      }
    }

    val depth = treeList.last._1
    treeList.filter(_._1 == depth).foldLeft(0) {
      case (sum, node) => sum + node._2.value
    }
  }

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }
}
