Feature: Get location

  Scenario: Capital is available when retrieving country information
    When I retrieve information about Estonia
    Then I am presented with Tallin as its capital