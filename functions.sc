// different types of functions and declarations


// ex of a shorthand method
// must declare type of arg
def multiplyByTwo(input: Int) =
  if (input == 0) input else input * 2

// the function above states that:
// if the input of the function is 0,
// then return the input, else
// return the input times 2
// notice: the last statement in a function is always
// the return

multiplyByTwo(20)

// ex of setting defaults, and creating a function block
def multiplyByTen(input: Int, ten: Int = 10): Int = {
  ten * input
}

// the function above sets a default argument "ten" equal
// to 10
// this argument can be overwritten!
// the function declares a block, which is types as an Int
// the last (...only) statement in the block multiplies the
// supplied input byt the variable value in "ten"

multiplyByTen(13)

// creating a function that does not return a value
// you can set the return type to "Unit"
// this is similar to returning void
def greeting(): Unit = println("Hello World!")

greeting()

// declaring a recursive function would require
// a typed return value

def factorial(x: Int): Int = {
  if (x == 0 || x == 1)
    x
  else
    x * factorial(x -1)
}

factorial(10)