@Regression

Feature: Validate home page features

  @Home @Sanity
  Scenario: Validate home page url navigation
    Given Navigate to home page
    Then Validate home page navigation

  @Home @Sanity
  Scenario: Validate home page menu tabs
    Given Navigate to home page
    Then Validate home page menu tabs

  @Home @Sanity
  Scenario: Validate home page social links
    Given Navigate to home page
    Then Validate home page social links

  @Home @Sanity
  Scenario: Validate home page nft categories
    Given Navigate to home page
    Then Validate home page nft categories