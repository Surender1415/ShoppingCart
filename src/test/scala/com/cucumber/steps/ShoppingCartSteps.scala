package com.cucumber.steps

import cucumber.api.junit.Cucumber
import cucumber.api.scala.{EN, ScalaDsl}
import main.scala.order.Cart
import main.scala.order.model.{Gadgets, Product}
import org.junit.runner.RunWith
import org.scalatest.Matchers

/**
  * Created by skudumula on 27/11/2016.
  */
@RunWith(classOf[Cucumber])
class ShoppingCartSteps extends ScalaDsl with EN with Matchers {
  var gadgets: Product = _
  var cart = new Cart()

  Given("^a single product") { () =>
    gadgets = Gadgets(10, "IPHONE", 2, 800)
  }

  When("""^the product is passed to application$""") { () =>
    cart.addProduct(gadgets)
  }

  Then("""^the application should add the product to shopping cart$""") { () =>
    cart.getProductCount should be > 0
  }
}
