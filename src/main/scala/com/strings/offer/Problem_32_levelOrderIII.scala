package com.strings.offer

import java.util

import scala.collection.mutable.ArrayBuffer

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Problem_32_levelOrderIII {

  /**
   * if(count % 2 == 0) level = level :+ node.value
   * else level = node.value +: level  尝试优化该部分的内存使用情况
   *
   * @param root
   * @return
   */

  def levelOrder(root: TreeNode): List[List[Int]] = {
    if(root == null) return Nil
    val queue = new util.LinkedList[TreeNode]()
    queue.add(root)
    val res:ArrayBuffer[ArrayBuffer[Int]] = new ArrayBuffer[ArrayBuffer[Int]]()
    var count = 0
    while (!queue.isEmpty){
      var level: ArrayBuffer[Int] = new ArrayBuffer[Int]()
      for(_ <- 0 until queue.size()){
        val node = queue.poll()
        if(count % 2 == 0) level = level :+ node.value
        else level = node.value +: level
        if(node.left != null) queue.add(node.left)
        if(node.right != null) queue.add(node.right)
      }
      res.append(level)
      count += 1
    }
    res.toList.map(_.toList)
  }

}
