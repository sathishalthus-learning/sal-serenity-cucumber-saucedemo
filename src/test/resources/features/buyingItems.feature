@Purchase
Feature: Purchase Items
  Buying some items and verifying all steps

  @singleItem
  Scenario: Buying a single item
    Given buyer navigated to login page
    And logging in with "standard_user" and "secret_sauce"
    When adding an item 
    |SauceLabs Backpack|
    Then verify the cart qty
    And completes the purchase

