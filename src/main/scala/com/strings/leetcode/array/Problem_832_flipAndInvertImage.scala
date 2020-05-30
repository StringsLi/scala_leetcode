package com.strings.leetcode.array

object Problem_832_flipAndInvertImage {

  def main(args: Array[String]): Unit = {
    val A = Array(Array(1,1,0),Array(1,0,1),Array(0,0,0))
    val res = flipAndInvertImage(A)
    res.foreach(x => println(x.toList))
  }

  def flipAndInvertImage(A:Array[Array[Int]]): Array[Array[Int]] ={
    A.map{_.reverse.map(1 - _)}
  }



}
