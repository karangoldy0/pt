package com.cpr.scala

object HigherOrderFunction {
  //Higher order function is a function that either takes a function as argument or returns a function.
  //In other words we can say a function which works with function is called higher order function.

  def main(args: Array[String]) = {
    functionExample(25, multiplyBy2) // Passing a function as parameter

    var result1 = (a: Int, b: Int) => a + b // Anonymous function by using => (rocket)
    var result2 = (_: Int) + (_: Int) // Anonymous function by using _ (underscore) wild card
    println(result1(10, 10))
    println(result2(10, 10))
  }

  def functionExample(a: Int, f: Int => AnyVal): Unit = {
    println(f(a)) // Calling that function
  }

  def multiplyBy2(a: Int): Int = {
    a * 2
  }

  def add(args: Int*) = {
    var sum = 0;
    for (a <- args) sum += a
    sum
  }
}