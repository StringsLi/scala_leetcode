package com.strings.leetcode.heap

object Problem_40_mians_getLeastNumbers {
  def getLeastNumbers(arr: Array[Int], k: Int): Array[Int] = {
    val heap = scala.collection.mutable.PriorityQueue.empty[Int].reverse
    arr.foreach(x => heap.enqueue(x))
    (0 until k).map(_ => heap.dequeue()).toArray
  }
}
