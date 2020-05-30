package com.strings.leetcode.math

import scala.collection.immutable.List


object combine {

  def calculateCombinedCombinations(degree: Int, vector: Vector[Double]): List[Double] = {
    if(degree == 0) {
      List()
    } else {
      val partialResult = calculateCombinedCombinations(degree - 1, vector)

      val combinations = calculateCombinations(vector.size, degree)

      val result = combinations map {
        combination =>
          combination.zipWithIndex.map{
            case (exp, idx) => scala.math.pow(vector(idx), exp)
          }.fold(1.0)(_ * _)
      }

      result ::: partialResult
    }
  }

  def calculateCombinations(length: Int, value: Int): List[List[Int]] = {
    if(length == 0) {
      List()
    } else if (length == 1) {
      List(List(value))
    } else {
      val res = value to 0 by -1 flatMap {
        v =>
          calculateCombinations(length - 1, value - v) map {
            v::_
          }
      }
      res.asInstanceOf[IndexedSeq[List[Int]]].toList
//      res.toList
    }
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(3.0,2.0,1.0)
    println(calculateCombinations(3,2))
    println(calculateCombinedCombinations(3,arr.toVector))
  }

}
