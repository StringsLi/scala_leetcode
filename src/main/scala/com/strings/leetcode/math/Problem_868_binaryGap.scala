package com.strings.leetcode.math

/**
 *
 * 给定一个正整数 N，找到并返回 N 的二进制表示中两个连续的 1 之间的最长距离。 
 *
 * 如果没有两个连续的 1，返回 0 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：22
 * 输出：2
 * 解释：
 * 22 的二进制是 0b10110 。
 * 在 22 的二进制表示中，有三个 1，组成两对连续的 1 。
 * 第一对连续的 1 中，两个 1 之间的距离为 2 。
 * 第二对连续的 1 中，两个 1 之间的距离为 1 。
 * 答案取两个距离之中最大的，也就是 2 。
 * 示例 2：
 *
 * 输入：5
 * 输出：2
 * 解释：
 * 5 的二进制是 0b101 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-gap
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

object Problem_868_binaryGap {

  def main(args: Array[String]): Unit = {
    println(binaryGap(22))
  }

  def binaryGap(N:Int)={

    val A = new Array[Int](32)
    var t = 0
    for(i <- 0 until 32) {
      if (((N >> i) & 1) != 0) {
        A(t) = i
        t += 1
      }
    }

    var ans = 0
    for (i <- 0 until t -1){
    ans = Math.max(ans, A(i+1) - A(i))
    }
     ans
  }


}
