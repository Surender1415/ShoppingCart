package main.scala.order

import main.scala.order.model.{Clothes, Gadgets, Grocery, User}

/**
  * Created by skudumula on 25/11/2016.
  */
object ShoppingCartMain extends App {
  println("Welcome to Shopping Cart")

  //Cart1 & User1
  var c1 = new Cart
  var c2 = new Cart
  var c3 = new Cart
  val user1 = User(c1)
  val user2 = User(c2)
  c1.addProduct(Grocery(6, "Apple", 10, 1.0))
  c1.addProduct(Clothes(5, "Pepe", 2, 10.0))
  c1.addProduct(Gadgets(4, "Keyboard", 10, 100.0))
  c1.getBasketDetails.foreach(println)
  println("c1 basket price is " + c1.getBasketPrice)
  val user3 = User(c3)

  //Cart 2 & User2
  c2.addProduct(Gadgets(1, "MACBOOK", 4, 10000.0))
  c2.addProduct(Grocery(2, "Rice", 1, 11.0))
  c2.addProduct(Clothes(3, "LEVIS", 1, 100.0))
  c2.getBasketDetails.foreach(println)
  println("c2 basket price is " + c2.getBasketPrice)

  //Cart3 & User3
  c3.addProduct(Grocery(7, "BANANA", 1, 1.0))
  c3.addProduct(Gadgets(8, "IWATCH", 1, 500.0))
  c3.getBasketDetails.foreach(println)
  println("c3 basket price is " + c3.getBasketPrice)

  // Cart.removeProduct(1)
}
