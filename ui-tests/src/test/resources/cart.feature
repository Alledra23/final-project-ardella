@web
Feature: User shopping flow on Demoblaze

  @cart
  Scenario: User adds a product to cart and verifies it
    Given user is on the demoblaze homepage
    And user clicks a product
    And user clicks "Add to cart"
    And user clicks cart
    Then the cart should contain the product name
