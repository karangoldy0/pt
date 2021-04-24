package com.cpr.sc

object printEachWord {
  def main(args: Array[String]) {

    val s = "The cat in the hat";

    val a = s.split(" ")
    a.foreach(x => println("word #" + (a.indexOf(x).toInt +1).toString() + " : " + x))
    
  }
}