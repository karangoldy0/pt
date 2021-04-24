package com.cpr.scala

case class emp(Name: String, Num: Int)
case class book(a: String)
object caseExamle extends App{
  
  val b1 = book("ACBCB")
  val b2 = book("ACBCB")
  val b3 = book("ACBCBDD")
    
  println(b1 == b2) 
  //true because it compare content not refernce
  println(b1 == b3)
  println(b2 == b3)

  //when we craete new object of classes they compare the 
  //reference instead of values
  //
}