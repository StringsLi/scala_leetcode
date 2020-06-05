package com.strings.offer

import java.util

import scala.collection.mutable.ArrayBuffer


object Problem_32_levelOrderII {

  def levelOrder(root: TreeNode): List[List[Int]] = {
    if(root == null) return Nil
    val queue = new util.LinkedList[TreeNode]()
    queue.add(root)
    val res:ArrayBuffer[ArrayBuffer[Int]] = new ArrayBuffer[ArrayBuffer[Int]]()
    while (!queue.isEmpty){
      val level:ArrayBuffer[Int] = new ArrayBuffer[Int]()
      for(_ <- 0 until queue.size()){
        val node = queue.poll()
        level.append(node.value)
        if(node.left != null) queue.add(node.left)
        if(node.right != null) queue.add(node.right)
      }
      res.append(level)
    }
    res.toList.map(_.toList)
  }

}
