@Regression

Feature: Validate sign up functionality

  @SignUp @Sanity
  Scenario: Validate home page sign up with valid email
    Given Navigate to home page
    When Input valid email id for signup
    And Click in signup button
    Then Validate signup functionality

  @SignUp @Negative @Sanity
  Scenario: Validate home page sign up with email id without @
    Given Navigate to home page
    When Input fake email id for signup
    And Click in signup button
    Then Validate signup functionality for negative case

  @SignUp @Negative @Sanity1
  Scenario: Validate home page sign up with email id without .com
    Given Navigate to home page
    When Input fake@ email id for signup
    And Click in signup button
    Then Validate signup functionality for negative case

  @SignUp @Negative @Sanity1
  Scenario: Validate home page sign up with email id with numbers
    Given Navigate to home page
    When Input 123456789 email id for signup
    And Click in signup button
    Then Validate signup functionality for negative case
