package com.strings.offer


class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Problem_27_mirrorTree {

  def mirrorTree(root: TreeNode): TreeNode = {
    if(root == null){
      return null
    }
    val left = mirrorTree(root.left)
    val right = mirrorTree(root.right)
    root.left = right
    root.right = left
    root
  }

  /**
   * 迭代版,超出内存限制，搞一下为甚me超出内存限制(使用scala的ListBuffer时），但是使用java的LinkList就能通过
   */

  def invertTree(root: TreeNode): TreeNode = {
    if(root == null) return null
    val queue = new java.util.LinkedList[TreeNode]
    queue.add(root)
    while (!queue.isEmpty){
      val current = queue.poll()
      val temp = current.left
      current.left = current.right
      current.right = temp
      if(current.left != null)  {
        queue.add(current.left)
      }
      if(current.right != null) {
        queue.add(current.right)
      }
    }
    root
  }

}
