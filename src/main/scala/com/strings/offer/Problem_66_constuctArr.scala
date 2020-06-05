package com.strings.offer

object Problem_66_constuctArr {

    def constructArr(a: Array[Int]): Array[Int] = {

      val L = Array.fill(a.length)(1)
      val R = Array.fill(a.length)(1)

      for(i <- 1 until a.length){
        L(i) = L(i-1) * a(i-1)
      }
      for(i <- Range(a.length-2,-1,-1)){
        R(i) = R(i+1) * a(i + 1)
      }

      L.zip(R).map(x => x._1 * x._2)

  }

}
