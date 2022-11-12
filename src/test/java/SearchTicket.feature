Feature: Search Form Test

  Scenario: Go to website and test Search Form Flight
    Given navigate to Website
    And click on origin text box
    And select origin city
    And click on destination text box
    And select destination city
    When click find cheapest ticket button
    Then verify to success message