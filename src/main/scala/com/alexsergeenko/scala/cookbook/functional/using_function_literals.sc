/**
 * You want to use an anonymous function—also known as a function literal—so you can
 * pass it into a method that takes a function, or to assign it to a variable.
 */

// the list
val x = List.range(1, 10)

// pass an anonymous function to the list filter
// method that will create new list that contains only even numbers
val evens = x.filter((i: Int) => i % 2 == 0) // List(2, 4, 6, 8)

// let's simplify it
val evensSimpler = x.filter(_ % 2 == 0)

