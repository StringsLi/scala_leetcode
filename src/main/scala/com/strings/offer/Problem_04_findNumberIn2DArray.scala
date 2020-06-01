package com.strings.offer

object Problem_04_findNumberIn2DArray {

  def findNumberIn2DArray(matrix: Array[Array[Int]], target: Int): Boolean = {
    if (matrix == null || matrix.length == 0 || matrix(0).length == 0) {
      return false
    }
    var i = 0
    var j = matrix(0).length - 1
    while (i < matrix.length && j >= 0) {
      if (matrix(i)(j) == target) {
        return true
      } else if (matrix(i)(j) < target) {
        i += 1
      } else {
        j -= 1
      }
    }
    false
  }

  def main(args: Array[String]): Unit = {
    val matrix = Array( Array(1,   4,  7, 11, 15),
                        Array(2,   5,  8, 12, 19),
                        Array(3,   6,  9, 16, 22),
                        Array(10, 13, 14, 17, 24),
                        Array(18, 21, 23, 26, 30))

    val target = 20
    println(findNumberIn2DArray(matrix,target))
  }
}
