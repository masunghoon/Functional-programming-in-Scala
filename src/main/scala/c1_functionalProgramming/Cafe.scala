package c1_functionalProgramming

/**
  * Created by masunghoon on 5/31/16.
  */
class Cafe {
  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
    val cup = new Coffee()
    p.charge(cc, cup.price)
    cup
  }
}
