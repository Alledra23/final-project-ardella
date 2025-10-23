@web
Feature: User shopping flow on Demoblaze

  Background:
    Given user is on the demoblaze homepage
    And user clicks a product
    And user clicks "Add to cart"
    And user clicks cart
    Then the cart should contain the product name

  @purchase
  Scenario: User completes a purchase successfully
    When user clicks button "Place Order"
    And user fills out the purchase form with valid details
    And user clicks "Purchase" to purchase
    Then user should see "Thank you for your purchase!"
