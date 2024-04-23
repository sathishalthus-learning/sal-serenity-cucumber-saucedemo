@Purchase
Feature: Purchase Items
  Buying some items and verifying all steps

  @validPurchase
  Scenario: Buying a single item
    Given buyer navigated to login page
    And logging in with "standard_user" and "secret_sauce"
    When adding an items 
    |Sauce Labs Backpack|
    |Sauce Labs Bike Light|
    Then verify the cart qty
    And completes the purchase

