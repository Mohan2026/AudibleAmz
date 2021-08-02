
Feature: Validating Login functionality of Audible
Scenario: User should login with username and password
    Given User should have account created in Audible
    When User enters username and password
    And User clicks login button
    Then User should be able to see the welcome message with name
