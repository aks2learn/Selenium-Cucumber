
Feature: To test login functionality

  Scenario: Successfull login with valid credentials
    Given user is on login page
    When user provides username and password
    And clicks on login button
    Then user is navigated to the home page

  