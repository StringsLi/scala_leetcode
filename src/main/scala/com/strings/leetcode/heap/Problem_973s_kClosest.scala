package com.strings.leetcode.heap

object Problem_973s_kClosest {

  def diff(arr: Array[Int]) = -arr(0)*arr(0) - arr(1)*arr(1)
  def kClosest(points: Array[Array[Int]], K: Int): Array[Array[Int]] = {
    val heap = scala.collection.mutable.PriorityQueue[Array[Int]]()(Ordering.by(diff))
    points.foreach(x => heap.enqueue(x))
    (0 until K).map(_ => heap.dequeue()).toArray
  }

  def main(args: Array[String]): Unit = {
    val points = Array(Array(1,3),Array(-2,2))
    kClosest(points,1).foreach(x=>println(x.mkString(",")))
  }

}
