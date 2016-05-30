package c1_functionalProgramming

/**
  * Created by masunghoon on 5/31/16.
  */
class Cafe {
  def buyCoffee(cc: CreditCard): Coffee = {
    val cup = new Coffee()
    cc.charge(cup.price)
    cup
  }
}
