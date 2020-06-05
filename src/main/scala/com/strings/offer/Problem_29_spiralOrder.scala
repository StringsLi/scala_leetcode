package com.strings.offer
import util.control.Breaks._
import scala.collection.mutable.ArrayBuffer

object Problem_29_spiralOrder {


  def spiralOrder(matrix: Array[Array[Int]]): Array[Int] = {
    if (matrix.length == 0) return Array()
    var l = 0
    var r = matrix(0).length - 1
    var t = 0
    var b = matrix.length - 1
    val res: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    breakable {
      while (true) {
        for (i <- l until r + 1) res.append(matrix(t)(i))
        t += 1
        if (t > b) break()
        for (i <- t until b + 1) res.append(matrix(i)(r))
        r -= 1
        if (r < l) break()
        for (i <- Range(r, l - 1, -1)) res.append(matrix(b)(i))
        b -= 1
        if (b < t) break()
        for (i <- Range(b, t - 1, -1)) res.append(matrix(i)(l))
        l += 1
        if (l > r) break()
      }
    }
    res.toArray
  }


  /**
   *  这种方式，
   * @param matrix
   * @return
   */
  def spiralOrder2(matrix: Array[Array[Int]]): Array[Int] = {
    if (matrix.length == 0) return Array()
    var l = 0
    var r = matrix(0).length - 1
    var t = 0
    var b = matrix.length - 1
    val res: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    var flag = true
    while (flag) {
      for (i <- l until r + 1) res.append(matrix(t)(i))
      t += 1
      if (t > b) flag = false // 虽然false了，但不会立马退出循环
      for (i <- t until b + 1) res.append(matrix(i)(r))
      r -= 1
      if (r < l) flag = false
      for (i <- Range(r, l - 1, -1)) res.append(matrix(b)(i))
      b -= 1
      if (b < t) flag = false
      for (i <- Range(b, t - 1, -1)) res.append(matrix(i)(l))
      l += 1
      if (l > r) flag = false
    }
    res.toArray
  }

  def main(args: Array[String]): Unit = {
    val matrix = Array(Array(1,2,3,4),Array(5,6,7,8),Array(9,10,11,12))
    println(spiralOrder(matrix).toList)
  }

}
