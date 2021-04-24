package com.cpr.scala

object HigherOrderFunctionExmaple {

  def main(args: Array[String]) {
    println(sumA(cube, 1, 5))
  }

  def sumA(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sumA(cube, a + 1, b)

  }

  def sumInt(a: Int, b: Int): Int = {
    if (a > b) 0 else a + sumInt(a + 1, b)
  }

  def cube(a: Int): Int = {
    a * a
  }

  //Anonomus function does not accosicated with name
  // in below sumA function we used direct function
  // when function do not required to use anywhere else the use it
  
  
  def sumB(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sumA((x: Int) => x * x, a + 1, b)

  }

}