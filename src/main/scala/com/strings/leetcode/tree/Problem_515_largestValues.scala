package com.strings.leetcode.tree

import scala.collection.mutable

//class TreeNode(var _value: Int) {
//  var value: Int = _value
//  var left: TreeNode = null
//  var right: TreeNode = null
//}

object Problem_515_largestValues {
  def main(args: Array[String]): Unit = {
    val head = new TreeNode(1)
    head.left = new TreeNode(9)
    head.right = new TreeNode(20)
    head.right.left = new TreeNode(15)
    head.right.right = new TreeNode(7)

    println(largestValues(head))
  }

  def largestValues(root: TreeNode): List[Int] = {
    val result: mutable.ArrayBuffer[mutable.ArrayBuffer[Int]] = new mutable.ArrayBuffer[mutable.ArrayBuffer[Int]]()
    if (root == null) return result.map(_.apply(0)).toList
    val queue:mutable.Queue[TreeNode] = new mutable.Queue[TreeNode]()
    queue.enqueue(root)

    while (!queue.isEmpty) {
      val cnt: Int = queue.size
      val levels: mutable.ArrayBuffer[Int] = new mutable.ArrayBuffer[Int]
      var i: Int = 0
      while ( i < cnt) {
        val node: TreeNode = queue.dequeue()
        levels.append(node.value)
        if (node.left != null) queue.enqueue(node.left)
        if (node.right != null) queue.enqueue(node.right)
        i += 1
      }
      result.append(levels)
    }
    result.toList.map(_.max)
  }
}
