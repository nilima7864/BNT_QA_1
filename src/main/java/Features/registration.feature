#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



Feature: Registration page

  @Tc1
  Scenario Outline: Login Scenario
    Given user launch on the website
    And  User land on registration form
    When user enter the "<firstname>" in firstname
    And user enter the "<lastname>" in lastname
    And user select the Gender
    And user enter the "<address>" in address
    And user enter the "<city>" in city
    And user enter the "<state>" in state
    And user enter the "<zipcode>" in zipcode
    And user select the country
    And user enter the "<email>" in email
    And user select the demo date
    And user select the time
    And user enter the "<mobileNumber>" in mobile number
    And user select the course details
    And user enter the "<verificationCode>" in verification
    And user click on submit button
    Then user redirect to the successfull registration page

    Examples: 
      | firstname | lastname  | address | city | state       | zipcode | email               | mobileNumber | verificationCode |
      | Ankit     | Dhakulkar | wakad   | pune | Maharashtra |  444444 | ankit2022@gmail.com |   9096907736 |               99 |



