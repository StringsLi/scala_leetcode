package com.strings.euler

import scala.collection.immutable.List

object P007 {

  def answer = {
    var nums = List.range(2,110000)
    var primes = List(2)

    while (primes.length < 10001){
      val prime = primes.head
      nums = nums.filter(b => b%prime != 0)
      primes = nums.head :: primes
    }
    primes.head
  }

  def main(args: Array[String]): Unit = {
    println(answer)
  }

}
