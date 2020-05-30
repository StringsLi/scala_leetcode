package com.strings.leetcode.math

object Problem_537_complexNumberMultiply {

  def main(args: Array[String]): Unit = {
    val a = "1+1i"
    val b = "1+1i"
    println(complexNumberMultiply(a,b))
  }

  def complexNumberMultiply(a:String,b:String)={
    val x = a.split("\\+|i")
    val y = b.split("\\+|i")
    val a_real = x(0).toInt
    val a_img = x(1).toInt
    val b_real = y(0).toInt
    val b_img = y(1).toInt

    a_real * b_real - a_img * b_img + "+" + (a_real * b_img + a_img * b_real) +"i"

  }

}
