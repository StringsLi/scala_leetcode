package com.strings.euler

object P002 {

  def fib (a :Int, b :Int) :Int =
    (if (b % 2 == 0) b else 0) + (if (a+b > 4000000) 0 else fib(b, a+b))
  def answer = fib(1, 2)

  def main(args: Array[String]): Unit = {
    println(answer)
  }


}
