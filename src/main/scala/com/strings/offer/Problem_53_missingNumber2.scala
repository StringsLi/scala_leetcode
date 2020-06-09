package com.strings.offer

object Problem_53_missingNumber2 {

  def main(args: Array[String]): Unit = {
    val nums = Array(0,1,2,3,4,5,6,7,9)
    println(missingNumber(nums))
  }

  def missingNumber(nums: Array[Int]): Int = {
    if(nums.length == 0) return 0
    var left = 0
    var right = nums.length - 1
    while (left <= right){
      val mid = left + (right - left) / 2
      if( mid == nums(mid)){
        left = mid + 1
      }else{
        right = mid - 1
      }
    }
    left
  }

}
