/**
 * You want to iterate through each character in a string, performing an operation on each
 * character as you traverse the string.
 */

// Create uppercase string using map
val upper = "hello, world".map(c => c.toUpper)

// or
val upper1 = "hello, world".map(_.toUpper)

// using for loop
for (c <- "hello") println(c)

// using for comprehension
val upper2 = for (c <- "hello, world")
  yield c.toUpper

// one more example
val result = for {
  c <- "hello, world"
  if c != 'l'
} yield c.toUpper // result: String = HEO, WORD

// Understanding the map method
"HELLO".map(c => (c.toByte + 32).toChar) // to lowercase

// second example
"HELLO".map{ c=>
  (c.toByte + 32).toChar
}

// pass custom method to map
// write your own method that operates on a character
def toLower(c: Char): Char = (c.toByte + 32).toChar
"HELLO".map(toLower) //res3: String = hello

// the same method works for for/yield approach
val str = "HELLO"
for (c <- str) yield toLower(c) // res4: String = hello

/**
 * A complete method shows Adler-32 checksum calculation
 */
object Adler32Checksum {
  val MOD_ADLER = 65521

  def adler32sum(str: String): Int = {
    var a = 1
    var b = 0
    str.getBytes.foreach{ char =>
      a = (char + a) % MOD_ADLER
      b = (b + a) % MOD_ADLER
    }
    b * 65536 + a // or (b << 16) + a
  }

  def main(args: Array[String]): Unit = {
    val sum = adler32sum("Wikipedia")
    println(f"checksum (int) = $sum%d\n")
  }
}