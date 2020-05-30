package com.strings.leetcode.tree

import scala.collection.mutable.ArrayBuffer


/**
 *
 * 这个代码在运行时，好像有些问题
 * @param _value
 */
class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Problem_113_pathSum {
  def main(args: Array[String]): Unit = {
    val head = new TreeNode(1)
    head.left = new TreeNode(9)
    head.right = new TreeNode(20)
    head.right.left = new TreeNode(15)
    head.right.right = new TreeNode(7)



    println(pathSum(head,28))
    println(pathSum(null,28))
  }

  val list: ArrayBuffer[ArrayBuffer[Int]] = new ArrayBuffer[ArrayBuffer[Int]]()
  val inner:ArrayBuffer[Int] = new ArrayBuffer[Int]()

  def pathSum(root: TreeNode,sum:Int): List[List[Int]] = {
    if (root == null) return new ArrayBuffer[ArrayBuffer[Int]]().toList.map(_.toList)
    inner.append(root.value)
    if(root.left == null && root.right == null && sum - root.value == 0){
        list.append(inner.clone())
    }
    if(root.right != null) pathSum(root.right,sum - root.value)
    if(root.left != null) pathSum(root.left,sum - root.value)

    inner.remove(inner.size - 1)
    list.toList.map(_.toList)

  }


}
