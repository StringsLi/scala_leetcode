package com.strings.leetcode.heap

import scala.collection.mutable.ArrayBuffer

object Problem_719s_smallestDistancePair {

  def smallestDistancePair(nums: Array[Int], k: Int): Int = {
    val pair:ArrayBuffer[Int] = new ArrayBuffer[Int]()
    for(i <- 0 until nums.length){
      for(j <- i+1 until nums.length){
        pair.append(scala.math.abs(nums(i) - nums(j)))
      }
    }
    val heap = scala.collection.mutable.PriorityQueue.empty[Int].reverse
    pair.toArray.foreach(x => heap.enqueue(x))
    (0 until k).map(_ => heap.dequeue()).apply(0)
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(1,3,1)
    println(smallestDistancePair(nums,1))
  }
}
