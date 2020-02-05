// basic if-else
val a = 10
val b = 15
val greater = if (a > b) a else b

// basic try
val result = try {
  "123".toInt
} catch {
  case _: Throwable => 0
}