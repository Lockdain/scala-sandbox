import scala.util.{Failure, Success, Try}
// This scala sheet refers to point 20.6 "Using the Option/Some/None Pattern" p. 658
/**

Provided solutions:
 1. Return option from a method
 2. Getting the value from an Option
 3. Using Option with collections
 4. Using Option with frameworks
 5. Using Try/Success/Failure when we need the error message (Scala 2.10 and higher)
 6. Using Either/Left/Right when we need the errormessage (pre-Scala 2.10)
Option may have one or no value.
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

// Getting the value from an Option
/**
 * There several ways:
 *  1. Use getOrElse
 *  2. Use foreach
 *  3. Use a match expression
 */
val z = toInt("1").getOrElse(0) // 1
val a = toInt("foo").getOrElse(0) // 0

// foreach
toInt("1").foreach{i =>
  println(s"Got an int: $i")
}

toInt("foo").foreach{i =>
  println("Any")
}

// Using a match expression
toInt("1") match {
  case Some(i) => println(i) // 1
  case None => println("That didn't work")
}

toInt("foo") match {
  case Some(i) => println(i)
  case None => println("That didn't work") // that didn't work
}

/**
 * Using Option with Scala collections
 */
val bag = List("1", "2", "3", "4", "foo", "bar")

// So we need a list of Integers that can be converted from a given list of Strings
bag.map(toInt) // List[Option[Int]] = List(Some(1), Some(2), Some(3), Some(4), None, None)

// Use flatten
bag.map(toInt).flatten //  List[Int] = List(1, 2, 3, 4)

// Map + Flatten is the same as flatMap
bag.flatMap(toInt) // List[Int] = List(1, 2, 3, 4)

// The collect method can give the same result
bag.map(toInt).collect{case Some(i) => i} // List[Int] = List(1, 2, 3, 4)

/**
 * Using Option with other frameworks.
 * Using Try, Success and Failure
 *
 * The result of a computation wrapped in a Try will be one of its subclasses: Success or
 * Failure. If the computation succeeds, a Success instance is returned; if an exception
 * was thrown, a Failure will be returned, and the Failure will hold information about
 * what failed.
 */

import scala.util.{Try, Success, Failure}

def divideXByY(x: Int, y: Int): Try[Int] = {
  Try(x / y)
}

divideXByY(2, 2) // Success(1)
divideXByY(2, 0) // Failure(java.lang.ArithmeticException: / by zero)

// Extract result
val v = divideXByY(1, 1).getOrElse(0) // 1

// Using foreach
divideXByY(1, 1).foreach(println)

// If the error message is needed
divideXByY(1, 1) match {
  case Success(i) => println(s"Success $i")
  case Failure(exception) => println(exception)
}

/**
 * The Try class has the added benefit that you can chain operations together, catching
 * exceptions as you go. For example, the following code won’t throw an exception, re‐
 * gardless of what the values of x and y are:
 */
val a1 = "123"
val a2 = "321"

val z1 = for {
  a <- Try(a1.toInt)
  b <- Try(a2.toInt)
} yield a * b

val answer = z1.getOrElse(0) * 2

/**
 * As shown in the Solution, if there’s a weakness of using Option, it’s that it doesn’t tell
 * you why something failed; you just get a None instead of a Some. If you need to know
 * why something failed, use Try instead of Option.
 */