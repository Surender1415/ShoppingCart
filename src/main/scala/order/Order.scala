package main.scala.order

import main.scala.order.model.Product

/**
  * Created by skudumula on 25/11/2016.
  */
trait Order {
  def addProduct(product: model.Product)

  def removeProduct(pid: Int)

  def getBasketDetails: scala.collection.mutable.Set[Product]

  def getBasketPrice: Double

  def getProductFromBasket(pId: String): model.Product

  def getProductCount: Int

}
