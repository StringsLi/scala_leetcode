package com.strings.leetcode.heap

import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.List

object Problem_373s_kSmallestPairs {

  def diff(num: List[Int]) = {-num(0) - num(1)}
  def kSmallestPairs(nums1: Array[Int], nums2: Array[Int], k: Int): List[List[Int]] = {
    if(k==0||nums1.length== 0){ List()}
    else{
      val pair:ArrayBuffer[List[Int]] = new ArrayBuffer[List[Int]]()
      for(i <- 0 until nums1.length){
        for(j <- 0 until nums2.length){
          pair.append(List(nums1(i),nums2(j)))
        }
      }
      val heap = scala.collection.mutable.PriorityQueue[List[Int]]()(Ordering.by(diff))
      pair.toArray.foreach(x => heap.enqueue(x))

      var tmpk= k
      if(heap.size < k){
        tmpk = heap.size
      }

      (0 until tmpk).map(_ => heap.dequeue()).toList
    }

  }

  def main(args: Array[String]): Unit = {
    val nums1 = Array(1,7)
    val nums2 = Array(2)
    val k = 3
    println(kSmallestPairs(nums1,nums2,k))
  }

}
