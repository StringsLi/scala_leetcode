package com.strings.offer

object Problem_12_exist {

  def dfs(board:Array[Array[Char]],word:Array[Char],i:Int,j:Int,k:Int): Boolean ={
    if(i >= board.length | i < 0 || j >= board(0).length || j < 0 ||board(i)(j) != word(k)) return false
    if(k == word.length -1) return true
    val tmp = board(i)(j)
    board(i)(j) = '/'
    val res = dfs(board,word,i+1,j,k+1) || dfs(board,word,i-1,j,k+1) ||
              dfs(board,word,i,j-1,k+1) || dfs(board,word,i,j+1,k+1)

    board(i)(j) = tmp
    res
  }

  def exist(board: Array[Array[Char]], word: String): Boolean = {
    val wordChar = word.toCharArray
    for(i <- 0 until board.length){
      for(j <- 0 until board(0).length){
        if(dfs(board,wordChar,i,j,0)) return true
      }
    }
    false
  }

  def main(args: Array[String]): Unit = {
    val board = Array(Array("A","B","C","E"),Array("S","F","C","S"),Array("A","D","E","E")).map(_.map(_.toCharArray.apply(0)))
    val word = "ABCCED"

    println(board.toList.map(_.toList))

    println(exist(board,word))

  }

}
