package com.strings.offer

/**
 * */

object Problem_68II_lowestCommonAncestor {

  def lowestCommonAncestor(root:TreeNode,p:TreeNode,q:TreeNode):TreeNode = {
    if(root == null || root == p || root == q) return root
    val left = lowestCommonAncestor(root.left,p,q)
    val right = lowestCommonAncestor(root.right,p,q)

    if(left == null && right == null)  null
    else if(left == null) right
    else if(right == null) left
    else root
  }

}
