

object For {
  def main(args: Array[String]): Unit = {
    val text:String = scala.io.Source.fromFile("dante.txt").mkString
    val words = text.split("\\W")
    var counts:collection.mutable.Map[String,Int] = collection.mutable.Map()

    for (i <- 0 until words.length) {
      val word = words(i).trim()
      counts(word) = counts.getOrElse(word, 0) + 1
    }

    counts.foreach(p => println(p._1 + " -> " + p._2))
    println ("Words: " + counts.size)
  }
}
