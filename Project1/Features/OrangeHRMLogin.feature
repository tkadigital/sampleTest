Feature: OrangeHRM Logo
  Scenario: Login working in OrangeHRM
    Given I launch chrome browser
    When I open OrangeHRM home Page
    Then I Verify login name & password on Login-page
    And Close chrome browser