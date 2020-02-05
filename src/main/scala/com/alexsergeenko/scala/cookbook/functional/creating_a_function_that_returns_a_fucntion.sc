/**
 * You want to return a function (algorithm) from a function or method.
 */

// anonymous function that takes a String
// and returns a String
val prefix = "pre"
(s: String) => { prefix + " " + s}

// you can return that anonymous function from the body
// of another function
def saySomething(prefix: String) = (s: String) => {
  prefix + " " + s
}

// create a new function
val sayHello = saySomething("Hello")

sayHello("Al") // String = Hello Al

