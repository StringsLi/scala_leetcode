package com.strings.euler

object P003 {

  def lpf (divis :Long, divid :Long) :Long = {
    if (divid % divis == 0) lpf(2, divid/divis)
    else if (divis > scala.math.sqrt(divid)) divid
    else lpf(divis+1, divid)
  }
  def answer = lpf(2l, 600851475143L)

  def main(args: Array[String]): Unit = {
    println(answer)
  }

}
