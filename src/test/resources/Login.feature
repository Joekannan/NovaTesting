@tag
Feature: Login Scenarios
  I want to maintain all login scenarios under this feature file

  @tag1
  Scenario: Happy path Login
    Given I am on homepage
    When I login using "Testone" and "Test123"
    Then I should be signed in successfully

  @tag2
  Scenario Outline: Login for multiple user
    Given I am on homepage
    When I login using "<Username>" and "<Password>"
    Then I should be signed in successfully

    Examples: 
      | Username | Password |
      | Testone  | Test123  |
      | Testtwo  | Test123  |
      | Testjoe  | Test123  |
