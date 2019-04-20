// basic loop
// read the "<-" as "in"
// so - "for i in 1 to 10"

for (i <- 1 to 10) println(i)

// 1 to 10 create an immutble, inclusive range range
// for an exclusive range, use the word "until"

for (i <- 1 until 10) println(i)

// the <- is known as a generator
// each generator can have a guard
// a guard is a boolean condition preceeded by
// an "if" that allows for processing of elements
// that match the condition

// loop with condition

for (i <- 1 to 10 if i % 2 == 0) println(i)

// use the yield keyword to create and store a
// new immutable collection

val numbers = for (i <- 1 to 10 if i % 3 == 0) yield i
numbers

// equivilent of a switch:

val age = 20

age match {
  case 10 => println("Age is 10")
  case 20 => println("Age is 20")
  case _ => println("No match for age")
}