package com.cpr.scala

object InhertienceTest {
  val car = new Car(200)
  
}

class vehicle(speed: Int) {
  val mph: Int = speed
  def race() = {
    println("Recaing")
  }
  def doStuff() = { println("ABC") }
}

class Car(speed: Int) extends vehicle(speed) {
  override val mph: Int = speed

  override def race() = {}
  override def doStuff() = { println("") }

}