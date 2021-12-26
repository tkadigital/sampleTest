Feature: OrangeHRM Login
  Scenario: Logo presence in OrangeHRM homepage
    Given I launch chrome browser
    When I open OrangeHRM home Page
    Then I Verify logo present on page
    And Close chrome browser