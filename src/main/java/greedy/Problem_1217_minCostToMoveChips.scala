package greedy

object Problem_1217_minCostToMoveChips {

  def minCostToMoveChips(chips: Array[Int]): Int = {
    val odd_num = chips.filter(_%2 == 1).length
    val num2 = chips.filter(_%2 == 0).length

    val res1 = if(odd_num > num2) num2 else  odd_num
    res1
  }

}
