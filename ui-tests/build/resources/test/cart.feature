@web
Feature: User shopping flow on Demoblaze

  @cart
  Scenario: User adds a product to cart and verifies it
    Given user is on the demoblaze homepage
    When user login
    And user clicks "Samsung galaxy s6" product
    And user clicks "Add to cart" and accepts alert
    Then the cart should contain "Samsung galaxy s6"
