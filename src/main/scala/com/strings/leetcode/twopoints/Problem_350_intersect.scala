package com.strings.leetcode.twopoints

import scala.collection.mutable.ArrayBuffer

object Problem_350_intersect {

  def main(args: Array[String]): Unit = {
    val nums1 = Array(1,2,2,1)
    val nums2 = Array(2,2)
    println(intersect(nums1,nums2).mkString(" "))
  }

  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val sorted_nums1 = nums1.sorted
    val sorted_nums2 = nums2.sorted
    var p1 = 0
    var p2 = 0
    val res:ArrayBuffer[Int] = new ArrayBuffer[Int]()
    while (p1 < sorted_nums1.length & p2 < sorted_nums2.length){
      if(sorted_nums1(p1) < sorted_nums2(p2)){
        p1 += 1
      }else if (sorted_nums1(p1) == sorted_nums2(p2)){
        res.append(sorted_nums1(p1))
        p1 += 1
        p2 += 1
      } else{
        p2 += 1
      }
    }
    res.toArray
  }

}
