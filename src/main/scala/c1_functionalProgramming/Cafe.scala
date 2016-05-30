package c1_functionalProgramming

/**
  * Created by masunghoon on 5/31/16.
  */
class Cafe {
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, Charge(cc, cup.price))
  }
}
