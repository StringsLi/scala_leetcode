package com.strings.euler

object P001 {

  def answer = (0 until  1000).filter(a => a % 3 == 0 || a % 5 == 0).sum

  def main(args: Array[String]): Unit = {
    println(answer)
  }

}
