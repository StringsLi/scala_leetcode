package com.strings.offer

object Problem_55_maxDepth {

  /**
   * 递归方法
   * @param root
   * @return
   */
  def maxDepth(root: TreeNode): Int = {

    if(root == null) return 0
    val left_depth = maxDepth(root.left)
    val right_depth = maxDepth(root.right)

    scala.math.max(left_depth,right_depth) + 1
  }

  def maxDepth2(root: TreeNode): Int = {
    if(root == null) return 0
    val queue = new  java.util.LinkedList[TreeNode]()
    queue.add(root)
    var depth = 0
    while (!queue.isEmpty){
      val size = queue.size()
      for(_ <- 0 until size){
        val node = queue.poll()
        if(node.right != null) queue.add(node.right)
        if(node.left != null) queue.add(node.left)
      }
      depth += 1
    }

    depth

  }

}
