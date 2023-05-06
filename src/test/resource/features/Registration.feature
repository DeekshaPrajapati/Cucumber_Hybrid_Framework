Feature: Registration Functionality

  Background: 
    Given User open browzer
    And User open url
    Then validate url open
    And User click on maxmize icon
    # Then validate a home page url
    And User click on Account button
    And User click on Register button
    Then Validate User navigates to Register Account page

  @Regression
  Scenario Outline: User creates an account only with all fields
    When User enters the first name "<FirstName>"
    And User enter the last name "<LastName>"
    And User enter email "<Email>"
    And User enter telephone number "<telephoneno>"
    And User enter password "<password>"
    And User enter confirm password "<confirmpass>"
    And User selects Privacy Policy
    And User clicks on Continue button
    Then User account should get created successfully
    When User click on account link button
    And User click on Logout button
    And user again click on a account button
    And user click on a register link

    Examples: 
      | FirstName | LastName  | Email                | telephoneno | password | confirmpass |
      | diksha    | prajapati | diksha1912@gmail.com |  9856474523 |     1234 |        1234 |

  @Integration
  Scenario Outline: User creates a duplicate account
    When User enters the first name "<FirstName>"
    And User enter the last name "<LastName>"
    And User enter email "<Email>"
    And User enter telephone number "<telephoneno>"
    And User enter password "<password>"
    And User enter confirm password "<confirmpass>"
    And User selects Privacy Policy
    And User clicks on Continue button
    Then User account should get created successfully

    Examples: 
      | FirstName | LastName  | Email               | telephoneno | password | confirmpass |
      | diksha    | prajapati | diksha012@gmail.com |  9856474523 |     1234 |        1234 |

  @Sanity
  Scenario: User creates an account without filling any details
    Given user again click on a account button
    When user click on a register link
    When User dont enter any details into fields
    And User click  continue button
    Then User should get proper warning messages for every mandatory field
