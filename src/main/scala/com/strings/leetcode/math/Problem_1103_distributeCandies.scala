package com.strings.leetcode.math

object Problem_1103_distributeCandies {

  def main(args: Array[String]): Unit = {
    println(distributeCandies(7,4).mkString("-"))
  }


  def distributeCandies(candies: Int, num_people: Int): Array[Int] = {
    var candies1 = candies
    val res = new Array[Int](num_people)
    var i = 0
    while(candies1 != 0){
      res(i%num_people) += scala.math.min(i+1,candies1)
      candies1 -= scala.math.min(i+1,candies1)
      i += 1
    }
    res
  }

}
