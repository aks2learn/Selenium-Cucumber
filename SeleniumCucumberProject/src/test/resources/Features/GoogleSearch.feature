Feature: Google search

  Scenario: Verify google search
    Given Browser is open
    And User is on google search page
    When user enters a keyword
    And hits enter
    Then user is navigated to search results