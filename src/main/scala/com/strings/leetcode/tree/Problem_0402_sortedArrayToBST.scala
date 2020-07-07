package com.strings.leetcode.tree

import com.strings.offer.TreeNode

object Problem_0402_sortedArrayToBST {

    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
      if(nums.length == 0) return null
      val mid = nums.length / 2
      val root = new TreeNode(nums(mid))
      root.left = sortedArrayToBST(nums.slice(0,mid))
      root.right = sortedArrayToBST(nums.slice(mid+1,nums.length))

      root
    }

}
