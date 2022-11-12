Feature: Register Test

  Scenario Outline: Create an Account

    Given Navigate to Website
    And click register button
    And type email "<Email>"
    And type password "<Password>"
    When click on create an Account button
    Then verify to success for register "<VerifyName>"
    Examples:
      | Email | Password | VerifyName |

      | hasan.kemal2@enuygun.com | 1231234 | hasankemal2 |


