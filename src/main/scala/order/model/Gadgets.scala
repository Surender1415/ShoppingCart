package main.scala.order.model

/**
  * Created by skudumula on 26/11/2016.
  */
case class Gadgets(override var productId: Int, override var productName: String, override var quantity: Int, override var price: Double) extends Product {

}
