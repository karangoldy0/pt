package com.cpr.scala

object AnonymousFunction extends App{
  
  //Anonymous function does not associate with name
  // in below sumA function we used direct function
  // when function do not required to use anywhere else the use it
  
  val x = (1 to 10)
  //x.foreach(println)
  println("-----------")
  //x.foreach((x:Int)=> println(x))
  
  println(x.reduceLeft(_+_))
  println(x.reduceLeft(_-_))
  println(x.reduceLeft(_ min _))
  println(x.reduceLeft(_ max _))
  
  
  
}