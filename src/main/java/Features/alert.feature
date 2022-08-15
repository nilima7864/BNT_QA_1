Feature: To check alert box functionality

  @Alert1
  Scenario: To verify that when user click on alert box then alert box should be displayed and user perform action
    Given user launch on the website
    And user lands on alert
    When user clicks on alert box
    Then alert box should be open
    When user click on ok then alert box should be close

  @Alert2
  Scenario: To verify that when user click on confirm alert box then confirm pop up should be displayed and user perform action
    Given user launch on the website
    And user lands on alert
    When user click on confirm alert box
    Then confirm alert box should be displayed to user
    When user perform the action
    Then confirm alert box should be close

  @Alert3
  Scenario: To verify that when user click on prompt alert box then alert box should be displayed and user perform action
    Given user launch on the website
    And user lands on alert
    When user click on prompt alert box
    Then prompt alert box should be displayed to user
    When user perform the action
    Then prompt alert box should be close
