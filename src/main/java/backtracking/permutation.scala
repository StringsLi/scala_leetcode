package backtracking

object permutation {

  def nineNnine() = {
    (1 to 9).map{
      r => (1 to r).map{ c => f"$c × $r = ${r*c}%-2d" }.mkString(" ")
    }.mkString("\n")
  }

  def perm[A]: Seq[A] => Seq[Seq[A]] = {
    case Seq() => Seq(Nil);
    case xs => for(x <- xs;rs <- perm(xs diff Seq(x))) yield x+:rs
  }

  def main(args: Array[String]): Unit = {
    println(perm("abc"))
    println(nineNnine())
  }

}
