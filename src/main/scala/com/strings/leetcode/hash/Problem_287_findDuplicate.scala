package com.strings.leetcode.hash

import scala.collection.mutable.HashSet


object Problem_287_findDuplicate {

  def main(args: Array[String]): Unit = {
    val nums = Array(1,2,3,3,4)
    print(findDuplicate(nums))
  }

  def findDuplicate(nums:Array[Int]): Unit ={
    val set:scala.collection.mutable.Set[Int] = new HashSet[Int]()
    for(num <- nums){
      if(set.contains(num)) {
        return num
      }else
      set.add(num)
    }

  }

}
