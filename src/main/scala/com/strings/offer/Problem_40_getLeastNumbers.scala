package com.strings.offer

object Problem_40_getLeastNumbers {

  def getLeastNumbers(arr: Array[Int], k: Int): Array[Int] = {
    val heap = scala.collection.mutable.PriorityQueue.empty[Int].reverse
    arr.foreach(x => heap.enqueue(x))
    (0 until k).map(_ => heap.dequeue()).toArray
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(3,2,1)
    println(getLeastNumbers(arr,2).toList)
  }

}
