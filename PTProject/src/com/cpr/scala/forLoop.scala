package com.cpr.scala

object forLoop extends App {

  var a: Int = 2
  for (a <- 1 to 10) {
    //println(a)
  }

  //to includes start and end value given in the range,
  //while until excludes last value of the range. So, the below example will print only 1 to 9.

  for (a <- 1 until 10) {
    //println(a)
  }

  //We can use filter with look
  for (a <- 1 to 10 if a % 2 == 1) {
    //println(a)
  }

  //we have used yield keyword which returns a result after completing of loop iterations. The for use buffer
  //internally to store iterated result and after finishing all iterations it yields the final result from
  //that buffer. It does not work like imperative loop.

  var result = for (a <- 1 to 10) yield a
  for (i <- result) {
    //println(i)
  }
  //Collection
  var l = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  for (a <- l) {
    //println(a)
  }
  //or
  //l.foreach(println)
  //or
  //l.foreach(x => println(x))

  //The by keyword is used to skip the iteration. When you code like: by 2 it means,
  //this loop will skip all even iterations of loop.

  for (a <- 1 to 10 by 2){
    println(a)
  }
}