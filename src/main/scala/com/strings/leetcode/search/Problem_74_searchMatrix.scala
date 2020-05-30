package com.strings.leetcode.search

object Problem_74_searchMatrix {

  def main(args: Array[String]): Unit = {
    val matrix = Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 50))
    println(searchMatrix(matrix, 11))
    println(searchMatrix2(matrix, 11))
  }


  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    if (matrix.length == 0 || matrix == null) {
      false
    } else {
      val arr = matrix.reduce((x, y) => x ++ y)
      search(arr, target) != -1
    }
  }

  def search(nums: Array[Int], target: Int): Int = {
    var left = 0
    var right = nums.length - 1
    while (left <= right) {
      val mid = left + (right - left) / 2
      if (target == nums(mid)) {
        return mid
      } else if (target > nums(mid)) {
        left = mid + 1
      } else {
        right = mid - 1
      }
    }
    -1
  }

  def searchMatrix2(matrix: Array[Array[Int]], target: Int): Boolean = {
    if (matrix == null || matrix.length == 0) {
      false
    }
    else {
      val m = matrix.length
      val n = matrix.apply(0).length
      var left = 0
      var right = m * n - 1
      while (left <= right) {
        val mid = left + (right - left) / 2
        val elem = matrix(mid / n)(mid % n)
        if (target == elem) {
          return true
        } else if (target > elem) {
          left = mid + 1
        } else {
          right = mid - 1
        }
      }
      false
    }
  }


}
