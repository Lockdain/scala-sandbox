/**
You want to perform variable substitution into a string, like you can do with other
languages, such as Perl, PHP, and Ruby.
 */
val name = "Fred"
val age = 33
val weight = 200

println(s"$name is $age years old, and weights $weight pounds.") // processed string literal

// Using expressions in string literals
println(s"Age next year: ${age + 1}")
println(s"You are 33 years old: ${age == 33}")

// You're also need to use curly braces when printing object fields
case class Student(name: String, score: Int)
val hannah = Student("Hannah", 95)
println(s"${hannah.name} has a score of ${hannah.score}")

/**
 * printf style formatting
 */
println(f"$name is $age years old, and weights $weight%.0f pounds")

/**
 * Raw interpolator
 */
s"foo\nbar" // res5: String = foo bar
raw"foo\nbar" // res6: String = foo\nbar


