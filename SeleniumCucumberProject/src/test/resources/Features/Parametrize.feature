Feature: To verify the parametization 

  Scenario Outline: Validate the parametrization
    Given user is on test website login page
    When user enters <username> and <password>
    And clicks on login
    Then user is navigated next screen
Examples:
|username|password|
|Akhil|123|
|Anandhu|123|
|Nahaz|123|