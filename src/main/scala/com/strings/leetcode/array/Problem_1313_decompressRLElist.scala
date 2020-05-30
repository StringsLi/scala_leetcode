package com.strings.leetcode.array

import scala.collection.mutable.ArrayBuffer

object Problem_1313_decompressRLElist {

  def main(args: Array[String]): Unit = {
    val nums = Array(1,2,3,4)
    decompressRLElist(nums).foreach(println)
  }

  def decompressRLElist(nums:Array[Int]):Array[Int] = {

    val res:ArrayBuffer[Int] = new ArrayBuffer[Int]()
    for(i <- Range(0,nums.length-1,2)){
      for(j <- 0 until nums(i)){
        res.append(nums(i+1))
      }
    }
    res.toArray


  }

}
