package com.strings.offer

import scala.collection.mutable.ListBuffer

object Problem_54_kthLargest {

  def dfs(root:TreeNode,res:ListBuffer[Int]):Unit={
    if(root != null){
      dfs(root.left,res)
      res.append(root.value)
      dfs(root.right,res)
    }
  }


  def kthLargest(root: TreeNode, k: Int): Int = {
    val res = new ListBuffer[Int]()
    dfs(root,res)
    res(res.length - k -1)

  }

}
