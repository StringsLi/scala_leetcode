package com.strings.offer

/**
 * 建立一维动态数组 dp：
 *
 * 边界条件：dp[1] = dp[2] = 1，表示长度为 2 的绳子最大乘积为 1；
 * 状态转移方程：dp[i] = max(dp[i], max((i - j) * j, j * dp[i - j]))，可以这样理解：
 *  dp[i] 维持原状态不减，（i - j) *j 从j 处剪一下，剪下来的部分是i-j,i - j 不再剪了
 *  j * dp[i-j] 从j 处剪一下，剪下来的部分是i-j, i - j 继续剪
 *
 */

object Problem_14_cutRope {

  def main(args: Array[String]): Unit = {
    println(cuttingRope(10))
  }


  def cuttingRope(n: Int): Int = {

    val dp = Array.fill(n+1)(0)
    dp(2) = 1
    for(i <- 3 until n+1){
      for(j <- 0 until i){
        dp(i) = Math.max(dp(i),Math.max(j*(i-j),j * dp(i-j)))
      }
    }

    dp(n)
  }

}
