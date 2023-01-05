@StartScenario
Feature: Demo App Test
  Scenario: Buy Product
    Given I am in Products Page
    Then I should see the list of the products
    When I click on the backpack product
    When I choose color blue
    When I click plus to make qty into 2
    When I click Add to cart
    When I click my cart
    Then I should see my order in my cart
    When I click Proceed To Checkout
    When I put username "bod@example.com"
    When I put password "10203040"
    When I click Login
    Then I should be redirected to Shipping Address Page
    When I enter the shipping address
    When I click To Payment
    Then I should be redirected to Payment Info Page
    When I enter the payment card info
    When I click Review Order
    Then I should see the checkout info page
    When I click Place Order
    Then I should see "Checkout Complete"