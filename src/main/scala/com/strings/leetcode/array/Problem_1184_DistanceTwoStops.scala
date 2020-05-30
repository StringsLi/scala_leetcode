package com.strings.leetcode.array

object Problem_1184_DistanceTwoStops {
  def main(args: Array[String]): Unit = {
    val distance = Array(7,10,1,12,11,14,5,0)
    println(distanceBetweenBusStops(distance,7,2))
  }

  def distanceBetweenBusStops(distance: Array[Int], start: Int, destination: Int): Int = {
    var l1 = start
    var l2 = destination
    if(l1 > l2){
       l1 = destination
       l2 = start
     }
    val size = distance.length
     val postive = distance.slice(l1,l2)
      val negtive = distance.slice(l2,size)++distance.slice(0,l1)
    scala.math.min(postive.sum,negtive.sum)
  }
}
