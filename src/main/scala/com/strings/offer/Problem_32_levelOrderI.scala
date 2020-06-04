package com.strings.offer

import java.util

import scala.collection.mutable.ArrayBuffer

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Problem_32_levelOrderI {

  def levelOrder(root: TreeNode): Array[Int] = {
    if(root == null) return Array()
    val queue = new util.LinkedList[TreeNode]()
    queue.add(root)
    val res:ArrayBuffer[Int] = new ArrayBuffer[Int]()
    while (!queue.isEmpty){
      for(_ <- 0 until queue.size()){
        val node = queue.poll()
        res.append(node.value)
        if(node.left != null) queue.add(node.left)
        if(node.right != null) queue.add(node.right)
      }
    }
    res.toArray
  }

}
