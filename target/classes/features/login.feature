Feature: Login functionality

Background:
   Given User navigates to login page

  @Functional
  Scenario Outline: Login with valid credentials
    When User enters valid email address "<username>" into email field
    And User enters valid password "<password>" into password field
    And User clicks on Login button
    Then User should get successfully logged in

    Examples: 
      | username               | password |
      | amotooricap1@gmail.com |    12345 |
      

  @Smoke
  Scenario: Login with invalid credentials
    When User enters invalid email address into email field
    And User enters invalid password "1234567890" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch
