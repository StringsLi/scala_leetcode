package com.strings.offer

object Problem_20_isNumber {

  def isNumber(s:String): Boolean ={

    if(s == null || s.length() == 0){
      return false
    }
    var numSeen = false
    var dotSeen = false
    var eSeen = false
    val str = s.trim().toCharArray
    for(i <- 0 until str.length){
      if(str(i) >= '0' && str(i) <= '9'){
        numSeen = true
      }else if(str(i) == '.'){
        if(dotSeen || eSeen){
          return false
        }
        dotSeen = true
      }else if(str(i) == 'e' || str(i) == 'E'){
        if(eSeen || !numSeen){
          return false
        }
        eSeen = true
        numSeen = false
      }else if(str(i) == '-' || str(i) == '+'){
        if(i != 0 && str(i-1) != 'e' && str(i-1) != 'E'){
          return false
        }
      }else{
        return false
      }
    }
    numSeen
  }

  def main(args: Array[String]): Unit = {
    val str = Array("+100","5e2","-123","3.1416","0123")
    str.foreach(x => println(isNumber(x)))

    val str2 = Array("12e","1a3.14","1.2.3","+-5","-1E-16","12e+5.4")
    println("====>>="*10)
    str2.foreach(x => println(isNumber(x)))
  }

}
