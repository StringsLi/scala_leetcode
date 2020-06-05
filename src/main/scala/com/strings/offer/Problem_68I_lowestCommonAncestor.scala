package com.strings.offer

/**
 * 注意二叉搜偶树的性质
 * */

object Problem_68I_lowestCommonAncestor {

  def lowestCommonAncestor(root:TreeNode,p:TreeNode,q:TreeNode):TreeNode = {
    val rootVal = root.value
    val pVal = p.value
    val qVal = q.value
    if(pVal > rootVal && qVal > rootVal) lowestCommonAncestor(root.right,p,q)
    else if(pVal < rootVal && qVal < rootVal) lowestCommonAncestor(root.left,p,q)
    else root
  }

}
