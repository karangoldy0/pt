package com.cpr.scala

object ifStetement {
  def main(args: Array[String]) {

    var num: Int = 21

    if (num >=21){
      println("Yes")
    }else{
      println("No")
    }
    println(Checkif(5)) 
  }
  
  def Checkif(a:Int)= if(a>21) 1 else 2
  
}