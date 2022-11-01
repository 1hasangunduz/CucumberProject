Feature: Contact Us Test

  Scenario: Go to website and test Contact us Page
    Given navigate to Website
    And click on contact us button
    And select Subject Heading
    And type Email
    And type a message
    When click on send button
    Then verify to success message