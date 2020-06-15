package com.strings.offer

object Problem_64_sumN {

  def main(args: Array[String]): Unit = {
    println(sumNums(10))
    println(sumNums2(10))
    println(sumNums3(10))
  }

  def sumNums2(n: Int):Int = {
    Range(0,n+1).reduce((x,y) => x + y)
  }

  def sumNums3(n: Int):Int ={
    (Math.pow(n,2) + n).toInt >> 1
  }

  def sumNums(n: Int): Int = {
    try {
      1 / (n - 1)
     sumNums(n - 1) + n
    } catch {
      case _: Throwable =>
        n
    }
  }

}
