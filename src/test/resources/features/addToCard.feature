Feature: Add to Card Button
  Background:
    Given Go to the url
    When Close the popup
    And Login with valid credentials

    Scenario: Add to card
      Given Choose the "Television" module
      When Hover the "4" th. product
      Then Check the add to card button is displayed
      And Click the add the card button
      And Hover the shopping basket
      Then Check the produck is displayed in the shopping basket