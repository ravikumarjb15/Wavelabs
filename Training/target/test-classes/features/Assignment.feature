Feature: ToDo List
  Below scenarios will validate as per the assignment

  Scenario: Generate TestData
    Given Launch Demo application
    Then Generate random email

  Scenario: Account Creation
    Given Launch Demo application
    When Create Account
    Then Fill user data and Register account

  Scenario Outline: Login Validation
    Given Launch Demo application
    When Login to the account "<user>"
    Then Validate Home Page

    Examples: 
      | user      |
      | dummy     |
      | dummy     |
      | Validuser |

  Scenario: Adding to cart
    Given Launch Demo application
    When Navigate to women section
    Then Adding all the items to cart from the list
    When Navigate to dresses section
    Then Adding all the items to cart from the list
    When Navigate to Tshirts section
    Then Adding all the items to cart from the list
    And Navigating to cart
    Then cart total item count
    And Duplicate amount or product
    Then Delete third and sixth item

  Scenario: Mobile View
    Given Launch browser in Mobile view
    Given Launch Demo application
    When Login to the account
