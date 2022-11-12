Feature: Search Form Test

  Background:
    Given Navigate to Website
    And click register button

  Scenario Outline: Create account
    And type email "<Email>"
    And type password "<Password>"
    When click on create an Account button
    Then verify to success for register "<VerifyName>"
    Examples:
      | hasan.sabah@enuygun.com | 123123 | hasansabah |
      | hasan.enuygun@enuygun.com | 123123 | hasanenuygun |


