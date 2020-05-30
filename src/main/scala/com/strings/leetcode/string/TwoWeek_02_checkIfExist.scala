package com.strings.leetcode.string

/**
 *
 * 1347. 制造字母异位词的最小步骤数
 */

object TwoWeek_02_checkIfExist {

  def main(args: Array[String]): Unit = {

    val arr = Array(3,1,7,14)

    println(checkIfExist(arr))

  }

  def checkIfExist(arr: Array[Int]): Boolean = {

    var map:Map[Int,Int] = Map()

    arr.foreach { x =>
      if(x % 2 == 0) {
        if(map.contains(2 * x) || map.contains(x / 2)) return true
        else  map += (x -> x)

      }else{
        if(map.contains(2 * x)) return true
        else  map += (x -> x)
      }
    }

    false

  }

}
