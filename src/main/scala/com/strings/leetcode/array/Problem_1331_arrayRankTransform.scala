package com.strings.leetcode.array

object Problem_1331_arrayRankTransform {

  def main(args: Array[String]): Unit = {
    val arr = Array(37,12,28,9,100,56,80,5,12)
    println(arrayRankTransform(arr).mkString(" "))
  }

  def arrayRankTransform(arr: Array[Int]): Array[Int] = {
      var map :Map[Int,Int] = Map()
      var count = 1
      arr.toSet.toArray.sorted.foreach{
        x => map += (x -> count)
          count += 1
      }
      arr.map(map.getOrElse(_,0))

  }
}
