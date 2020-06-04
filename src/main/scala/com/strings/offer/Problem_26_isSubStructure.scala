package com.strings.offer



// Definition for a binary tree node.
 class TreeNode(var _value: Int) {
   var value: Int = _value
   var left: TreeNode = null
   var right: TreeNode = null
 }


object Problem_26_isSubStructure {
  def isSubStructure(A: TreeNode, B: TreeNode): Boolean = {
    var res = false
    if(A != null && B != null){
      if(A.value == B.value) res = helper(A,B)
      if(!res) res = isSubStructure(A.left,B)
      if(!res) res = isSubStructure(A.right,B)
    }
    res
  }
  def helper(A:TreeNode,B:TreeNode):Boolean = {
    if(B == null) return true
    if(A == null) return false
    if(A.value != B.value) return false
    helper(A.left,B.left) && helper(A.right,B.right)
  }

}
