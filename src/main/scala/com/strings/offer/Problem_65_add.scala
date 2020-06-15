package com.strings.offer

object Problem_65_add{

  def main(args: Array[String]): Unit = {
    val a  = 11
    val b = 2
    println(add(a,b))
  }

  def add(a: Int, b: Int): Int = {
    var _a = a
    var _b = b
    while (_a != 0){
      val tmp = _a ^ _b
      _a = (_a & _b) << 1
      _b = tmp
    }
    _b
  }

}
