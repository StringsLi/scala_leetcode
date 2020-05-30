package greedy

object Problem_1029_twoCitySchedCost {

  def main(args: Array[String]): Unit = {
    val costs = Array(Array(10,20),Array(30,200),Array(400,50),Array(30,20))
    println(twoCitySchedCost(costs))
  }

  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
      val sorted = costs.sortBy(x => x.apply(0) - x.apply(1))
      val half_size = sorted.length / 2

      sorted.slice(0,half_size).map(_.apply(0)).sum +
      sorted.slice(half_size,sorted.length).map(_.apply(1)).sum
  }

}
