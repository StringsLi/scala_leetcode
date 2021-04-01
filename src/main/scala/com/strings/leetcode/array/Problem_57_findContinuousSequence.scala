package com.strings.leetcode.array

import scala.collection.mutable.ArrayBuffer

object Problem_57_findContinuousSequence {

  def main(args: Array[String]): Unit = {
    val ret = findContinuousSequence(9)
    ret.foreach(x => println(x.mkString("-")))
  }

  def func(start:Int,end:Int) = {
    Range(start,end+1).toArray
  }

  def sum_arr(start:Int,end:Int)={
    func(start,end).sum
  }


  def findContinuousSequence(target: Int): Array[Array[Int]] = {
    var start = 1
    var end = 2
    val ret:ArrayBuffer[Array[Int]] = new ArrayBuffer[Array[Int]]()
    while(start < end){
      if(sum_arr(start,end) < target) {end += 1}
      else if(sum_arr(start,end) > target) {start += 1}
      else {
        ret.append(func(start,end))
        start += 1
      }
    }
    ret.toArray
  }

}
