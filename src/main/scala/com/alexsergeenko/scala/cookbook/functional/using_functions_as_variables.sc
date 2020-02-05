/**
 * You want to pass a function around like a variable, just like you pass String, Int, and
 * other variables around in an object-oriented programming language.
 * */

// assign function literal to a value
val double = (i: Int) => { i * 2 } // double is the instance

double(2) // 4
double(5) // 10

// the function is also can be invoked by passing to another method
val list = List.range(1, 5)
list.map(double)

// how to define function literals
val f = (i: Int) => { i % 2 == 0 }

// define the return type explicitly
val f1: (Int) => Boolean = i => { i % 2 == 0 }
val f2: Int => Boolean = i => i % 2 == 0

// one more example
val addThenDouble: (Int, Int) => Int = (x, y) => {
  val a = x + y
  2 * a
}

addThenDouble(5, 5) // Int = 20

/**
 * Using a method like an anonymous function
 */
// Ways to define a method
def modMethod(i: Int) = i % 2 == 0
def modMethod1(i: Int) = { i % 2 == 0}
def modMethod2(i: Int): Boolean = i % 2 == 0

// Any of these methods can be passed into collection
// methods that expect a function
val list1 = List.range(1, 10)
list1.filter(modMethod) // List[Int] = List(2, 4, 6, 8)

/**
 * Assigning an existing function/method to a function variable
 */
val c = scala.math.cos _ // partially applied function
//It’s partially applied because the cos method
//requires one argument, which you have not yet supplied

c(0) // Double = 1.0

// or the same for scala.math.pow
val p = scala.math.pow (_ , _)
println(f"Result: ${p(scala.math.E, 2)}%.5f")
