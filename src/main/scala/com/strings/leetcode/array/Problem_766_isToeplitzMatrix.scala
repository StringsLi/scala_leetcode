package com.strings.leetcode.array

/**
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 *
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 *
 * 示例 1:
 *
 * 输入:
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * 输出: True
 * 解释:
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是True。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/toeplitz-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

object Problem_766_isToeplitzMatrix {

  def main(args: Array[String]): Unit = {
    val matrix = Array(
    Array(1,2,3,4),
    Array(5,1,2,3),
    Array(9,5,1,1)
    )

    println(isToeplitzMatrix(matrix))
  }

  def isToeplitzMatrix(matrix: Array[Array[Int]]): Boolean = {
    for(i <- 0 until matrix.length){
      for(j <- 0 until matrix(0).length){
        if(i > 0 && j > 0 && matrix(i - 1)(j-1) != matrix(i)(j)) return false
      }
    }
    true
  }
}
