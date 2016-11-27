# Created by skudumula at 27/11/2016
Feature: Shopping Cart feature file
  #Feature file to test basic scenarios of shopping cart application.

  Scenario: Add a product to the shopping cart
    Given a single product
    When the product is passed to application
    Then the application should add the product to shopping cart