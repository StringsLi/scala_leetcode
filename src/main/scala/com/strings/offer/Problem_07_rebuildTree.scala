package com.strings.offer

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Problem_07_rebuildTree {
  def buildTree(preorder: Array[Int], inorder: Array[Int]): TreeNode = {
      val head = new TreeNode(preorder(0))
      val mid = inorder.indexOf(preorder(0))
      head.left = buildTree(preorder.slice(1,mid+1),inorder.slice(0,mid))
      head.right = buildTree(preorder.slice(mid+1,preorder.length),inorder.slice(mid+1,inorder.length))
    head
  }

  }
