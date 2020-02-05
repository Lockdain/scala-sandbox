/**
 * You want to eliminate repetitively passing variables into a function by (a) passing com‐
 * mon variables into the function to (b) create a new function that is preloaded with those
 * values, and then (c) use the new function, passing it only the unique variables it needs
 */

// let's consider a simple sum function
val sum = (a: Int, b: Int, c: Int) => a + b + c
val f = sum(1, 2, _) // partially applied function

f(3) // 6
