package com.strings.offer

object Problem_38_permutation {

  def permutation(s: String): Array[String] = {

    s.toCharArray.permutations.map(x => x.mkString).toArray

  }

  def main(args: Array[String]): Unit = {
    permutation("abc")
  }

}
