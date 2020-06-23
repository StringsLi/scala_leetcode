package com.strings.offer

import java.util.Arrays
import util.control.Breaks._

object Problem_61_isStraight {

  def main(args: Array[String]): Unit = {
    val nums = Array(0,0,1,2,5)
    println(isStraight(nums))
  }

  def isStraight(nums: Array[Int]): Boolean = {
    var ghost = 0
    Arrays.sort(nums)
    for(i <- 0 until nums.length - 1){
      breakable{
        if(nums(i) == 0) {
          ghost += 1
          break()
        }
        if(nums(i+1) == nums(i)){
          return false
        }
        if(nums(i+1) - nums(i) != 1) {
          ghost -= (nums(i+1) - nums(i)-1)
        }
      }
      }


    ghost >= 0
  }

}
