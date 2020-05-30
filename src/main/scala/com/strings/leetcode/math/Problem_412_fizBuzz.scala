package com.strings.leetcode.math

object Problem_412_fizBuzz {

  def main(args: Array[String]): Unit = {
    println(fizzBuzz(15))
  }

  def fizzBuzz(n: Int): List[String] = {
    Range.apply(1,n+1).map{ x =>
      if(x%3 == 0 & x%15 != 0){
        "Fizz"
      }else if(x%5 == 0 & x%15 != 0){
        "Buzz"
      }else if(x % 15 == 0){
        "FizzBuzz"
      }else{
        x.toString
      }
    }.toList
  }
}
