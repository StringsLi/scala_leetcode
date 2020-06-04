package com.strings.leetcode.math

object Problem_238_productExceptSelf {

    def productExceptSelf(nums: Array[Int]): Array[Int] = {
      val len = nums.length
      val L = Array.fill(len)(1)
      val R = Array.fill(len)(1)
      val res = Array.fill(len)(1)

      for(i <- 1 until len){
        L(i) = L(i-1) * nums(i-1)
      }
      for(i <- Range(len-2,-1,-1)){
        R(i) = R(i+1) * nums(i+1)
      }

      for(i <- 0 until len){
        res(i) = L(i) * R(i)
      }
      res
  }

}
