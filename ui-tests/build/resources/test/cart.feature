@web
Feature: User shopping flow on Demoblaze

  @cart
  Scenario: User adds a product to cart and verifies it
    Given user is on the demoblaze homepage
    And user clicks "Samsung galaxy s6" product
    And user clicks "Add to cart"
    Then the cart should contain "Samsung galaxy s6"
