
@tag
Feature: Registration scenarios
  I want to have multiple registration scenarios in this feature file

  @tag1
  Scenario: Registration Happy path
    Given I am on homepage
    When I enter unique details for registration
    Then I should be registered successfully
   

 
