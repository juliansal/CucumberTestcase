@SecondTest
Feature: Second Cucumber Test

  Background: This will run before each scenario
    And I wait 3 seconds

  Scenario: Go to Google
    Given I go to "google.com"
    And I wait 1 seconds