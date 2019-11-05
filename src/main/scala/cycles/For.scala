package cycles

object For {

  def main(args: Array[String]): Unit = {
    def unicode(str: String) = {
      var p = 1
      for (i <- 0 to str.length - 1) {
        println(str.charAt(i))
        p = p * str.charAt(i)
      }
      p
    }

    print(unicode("Hello"))


    def countdown(start: Int): Unit = {
      for (i <- start + 1 to 0 by -1) {
        println(i)
      }
    }

    countdown(10)

  }

}
