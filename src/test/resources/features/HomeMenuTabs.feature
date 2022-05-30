@Regression

Feature: Validate home page menu tabs functionality

  @HomeMenu @Sanity
  Scenario: Validate home page Explore tab functionality
    Given Navigate to home page
    When Click on Explore tab of home page
    Then Validate explore tab content

  @HomeMenu @Sanity
  Scenario: Validate home page Market tab functionality
    Given Navigate to home page
    When Click on Market tab of home page
    Then Validate market tab content

  @HomeMenu @Sanity
  Scenario: Validate home page How it works tab functionality
    Given Navigate to home page
    When Click on How It Works tab of home page
    Then Validate how it works tab content

  @HomeMenu @Sanity
  Scenario: Validate home page Resources tab functionality
    Given Navigate to home page
    When Click on Resources tab of home page
    Then Validate resources tab content