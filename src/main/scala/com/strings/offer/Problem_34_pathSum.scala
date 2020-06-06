package com.strings.offer

import scala.collection.mutable.ArrayBuffer

object Problem_34_pathSum {

  def main(args: Array[String]): Unit = {
      val head = new TreeNode(5)
      head.left = new TreeNode(4)
      head.left.left = new TreeNode(11)
      head.left.left.left = new TreeNode(7)
      head.left.left.right = new TreeNode(2)
      head.right = new TreeNode(8)
      head.right.left = new TreeNode(13)
      head.right.right = new TreeNode(4)
      head.right.right.left = new TreeNode(5)
      head.right.right.right = new TreeNode(1)
      println(pathSum(head,22))
  }

  val list: ArrayBuffer[ArrayBuffer[Int]] = new ArrayBuffer[ArrayBuffer[Int]]()
  val inner:ArrayBuffer[Int] = new ArrayBuffer[Int]()

  def pathSum(root: TreeNode,sum:Int): List[List[Int]] = {
    var _sum = sum
    if (root == null) return list.toList.map(_.toList)
    inner.append(root.value)
    _sum -= root.value
    if(_sum == 0 && root.left == null && root.right == null){
      list.append(inner.clone())
    }
    pathSum(root.right,_sum)
    pathSum(root.left,_sum)

    inner.remove(inner.size - 1)
    list.toList.map(_.toList)
  }

}
