package com.strings.leetcode.array

object Problem_88_merge{

  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    for(i <- 0 until n){
      nums1(i+m) = nums2(i)
    }
    java.util.Arrays.sort(nums1)
  }



}
