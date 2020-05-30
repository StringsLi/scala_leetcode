package com.strings.leetcode.array

object Problem_274_hIndex {

  def main(args: Array[String]): Unit = {
   println( hIndex(Array(100)))
  }

  def hIndex(citations: Array[Int]): Int = {
    val sorted = citations.sorted
    var i = 0
    while (i < sorted.length && sorted(sorted.length - 1 -i) > i){
      i += 1
    }
    i
  }

}
