package com.strings.leetcode.sort

object Problem_75_sortColors {

  def sortColors(nums: Array[Int]): Unit = {
    var cur = 0
    var p0 = 0
    var p2 = nums.length - 1
    var temp:Int = 0
    while (cur <= p2 ){
      if(nums(cur) == 0){
        temp = nums(p0)
        nums(p0) = nums(cur)
        nums(cur) = temp
        p0 += 1
        cur += 1
      }else if(nums(cur) == 2){
        temp = nums(cur)
        nums(cur) = nums(p2)
        nums(p2) = temp
        p2 -= 1
      }else{
        cur += 1
      }
    }

  }
  def main(args: Array[String]): Unit = {
    val nums = Array(1,1,0,2,1,2)
    sortColors(nums)
    println(nums.toList)
  }


}
