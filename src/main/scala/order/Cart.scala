package main.scala.order

import main.scala.order.model.{Gadgets, Product}

import scala.collection.mutable

/**
  * Created by skudumula on 25/11/2016.
  */
class Cart extends Order {

  //List(Person("joe",20), Person("fred",22), Person("joe", 20), Person("mary", 24)).distinct
  //  var basket = mutable.Set(Product(1, "Macbook pro", 2, 300.00), Product(2, "iphone", 1, 100.00),
  //    Product(3, "iwatch", 1, 10.00), Product(4, "magicmouse", 1, 5.00), Product(6,"Keyboard",1,100.0))
  var basket: mutable.Set[Product] = mutable.Set(Gadgets(1, "MACBOOK", 1, 300.00))

  override def addProduct(product: Product): Unit = {
    basket.find(p => p.productId == product.productId) match {
      case Some(p) => {
        p.quantity = product.quantity
        p.price = product.price * product.quantity
      }
      case None => basket += product
    }
  }

  override def removeProduct(pid: Int): Unit = {
    if (basket.nonEmpty) {
      var updatedbasket = basket.filterNot(_.productId == pid)
      updatedbasket.size
      basket = updatedbasket
    }
  }

  override def getBasketDetails: mutable.Set[Product] = {
    basket
  }

  override def getBasketPrice: Double = {
    val total = basket.map(_.price).sum
    total
  }

  override def getProductFromBasket(pId: String): Product = {
    val prod = basket.find(_.productId == pId).get
    prod
  }

  override def getProductCount: Int = {
    basket.size
  }
}
