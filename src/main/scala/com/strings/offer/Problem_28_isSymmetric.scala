package com.strings.offer

object Problem_28_isSymmetric {

  def helper(left:TreeNode,right: TreeNode):Boolean = {
//    if(left == null && right == null) return true
//    if(left == null || right == null) return false
    if(left == null || right == null) return left == right // 和上面一行是等价的
    if(left.value != right) return false
    helper(left.left,right.right) && helper(left.right,right.left)
  }

  def isSymmetric(root: TreeNode): Boolean = {
      if(root == null) return true
      helper(root.left,root.right)
  }

}
