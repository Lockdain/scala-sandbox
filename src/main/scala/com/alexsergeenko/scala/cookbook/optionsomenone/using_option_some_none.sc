import scala.util.{Failure, Success, Try}
// This scala sheet refers to point 20.6 "Using the Option/Some/None Pattern" p. 658
/*

Provided solutions:
 1. Return option from a method
 2. Getting the value from an Option
 3. Using Option with collections
 4. Using Option with frameworks
 5. Using Try/Success/Failure when we need the error message (Scala 2.10 and higher)
 6. Using Either/Left/Right when we need the errormessage (pre-Scala 2.10)

*/

// Returning an Option from a method
def toInt(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }
}

val x = toInt("12") // Some
val y = toInt("abcd") // None

// Or one more complicated example
def readTextFile(filename: String): Try[List[String]] = {
  Try(io.Source.fromFile(filename).getLines().toList)
}

val filename = "/test"

readTextFile(filename) match {
  case Success(lines) => lines.foreach(println)
  case Failure(exception) => println(exception)
}
