/**
 * In Scala, you create multiline strings by surrounding
 * your text with three double quotes
 */

val foo =
  """This is
    |a multiline
    |string
    |yeah
    |""".stripMargin


val bar =
  """This is
    |a multiline
    |string
    |yeah
    |""".stripMargin.replaceAll("\n", " ") // bar: String = This is a multiline string yeah


// Another nice feature of Scala’s multiline string syntax is that you can include single- and
// double-quotes without having to escape them
val s = """This is known as a
          |"multiline" string
          |or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")