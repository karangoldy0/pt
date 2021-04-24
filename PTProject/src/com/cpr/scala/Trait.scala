package com.cpr.scala

object Trait {
  //fundamentoly reuse ability of code
}

trait logged {
  def log(a: String) {
    println(a)
  }
}

trait logged1 extends logged {

}
trait logged2 {

}

trait logged3 {

}

class Account {
  protected var balance = 0
}

class SavingAccount extends Account with logged1 with logged2 {

  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient Funds")
    else balance - amount
  }

}
