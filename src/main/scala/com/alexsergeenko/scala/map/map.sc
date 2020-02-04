// immutable map
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
scores("Alice")

// mutable map
val mutableScores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 12)
mutableScores("Alice")

// empty mutable map
val emptyMutableMap = new scala.collection.mutable.HashMap[String, Int]

// tuple-style definition
val scoresTuple = Map(("Alice", 10), ("Bob", 5))

// extract values from map
val bobScore = scores("Bob")

// check whether the key exists
val scoreCheck = if(scores.contains("Bob")) scores("Bob") else 0

// shortened path
val scoreCheck1 = scores.getOrElse("Bob", 0)

// returns an instance of Option
val scoreCheck2 = scores.get("Bob")

