package com.strings.leetcode.search

object Problem_704_binarySearchII {

  def main(args: Array[String]): Unit = {
    val nums = Array(-1,0,3,5,9,12)
    println(search(nums,9))
    println(search(nums,2))
  }

  def search(nums: Array[Int], target: Int): Int = {
    var left = 0
    var right = nums.length - 1
    while (left <= right){
      val mid = left + (right - left) / 2
      if(target == nums(mid)) {
        return mid
      }else if(target > nums(mid)){
        left = mid + 1
      }else{
        right = mid - 1
      }
    }
    -1
  }

}
