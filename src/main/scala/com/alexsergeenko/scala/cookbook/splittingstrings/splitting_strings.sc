/**
 * You want to split a string into parts based on a field separator, such as a string you get
 * from a comma-separated value (CSV) or pipe-delimited file.
 */

"hello world".split(" ")

// The array will be created
"hello world".split(" ").foreach(println)

// or
"one, two, three, four".split(",") // Array(one,  two,  three,  four)

// using 'trim'
val s = "one, two, three, four"
s.split(",").flatMap(p => p.trim)



