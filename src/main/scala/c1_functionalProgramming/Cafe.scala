package c1_functionalProgramming

/**
  * Created by masunghoon on 5/31/16.
  */
class Cafe {
  type CreditCard = String

  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, Charge(cc, cup.price))
  }

  def Charge(cc: CreditCard, price: Int) = ???
}

class Charge(cc: String, price: Int) {

}

class Coffee {
  val price = 3000
}
