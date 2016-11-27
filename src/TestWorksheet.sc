import scala.collection.mutable

object test {

  val cart = new mutable.HashMap[String, String]
  cart.put("1", "Macbook pro")

  cart.foreach(print)
}
