package com.strings.leetcode.math

import scala.collection.mutable.ArrayBuffer

object Promlem_1611_divingBoard {

  def main(args: Array[String]): Unit = {
    val shorter = 1
    val longer = 2
    val k = 3
    println(divingBoard2(shorter, longer, k).toList)
  }

  def divingBoard(shorter: Int, longer: Int, k: Int): Array[Int] = {
    if(k == 0) return Array()
    val ret:ArrayBuffer[Int] = ArrayBuffer[Int]()
    for(i <- 0 until k+1){
      ret.append(shorter*(k-i) + longer *i)
    }
    ret.toSet.toArray.sorted
  }

  def divingBoard2(shorter: Int, longer: Int, k: Int): Array[Int] = {
    if(k == 0) return Array()
    if(shorter == longer) return Array(k * shorter)
    val ret = new Array[Int](k+1)
    for(i <- 0 until k+1){
      ret(i) = shorter*i + longer *(k-i)
    }
    ret
  }

}
