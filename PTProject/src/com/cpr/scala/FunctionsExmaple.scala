package com.cpr.scala

object FunctionsExmaple extends App {

  var result2 = functionExample(b = 15, a = 2)    // Parameters order have changed during call  
  
  //Default value function
  def functionExample(a: Int = 0, b: Int = 0): Int = { // Parameters with default values as 0
    a + b
  }
  
  
}