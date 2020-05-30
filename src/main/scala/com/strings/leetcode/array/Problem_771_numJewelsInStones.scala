package com.strings.leetcode.array

object Problem_771_numJewelsInStones {

  def main(args: Array[String]): Unit = {
    val J = "aA"
    val S = "aAAbbbb"
    println(numJewelsInStones2(J,S))

  }


  def numJewelsInStones(J: String, S: String): Int = {
    var count = 0
    S.toCharArray.foreach(c =>
      if(J.contains(c)) count += 1
    )
    count
  }

  def numJewelsInStones2(J: String, S: String): Int = {
    S.toCharArray.map(c => if(J.contains(c)) 1 else 0).sum
  }

  def numJewelsInStones3(J: String, S: String): Int = {
    S.toCharArray.filter(J.contains(_)).length
  }


}
