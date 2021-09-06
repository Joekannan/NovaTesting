@tag
Feature: Place Order
  I want to place various order for registered user

  Background: 
    Given I am on homepage
    When I login using "Testone" and "Test123"
    Then I should be signed in successfully
    
    
    
  @tag2
  Scenario Outline: Place order for various categories
    When I place an order for "<Category>"
    Then Order should be placed successfully

    Examples: 
      | Category |
      | Phones   |
      | Laptops  |
      | Monitors |
