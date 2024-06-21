Feature: Search a Product on Amazon

  Scenario: Login Amazon and Search a Product
  
    Given user launch browser open amazon
    And user search product
    Then user close Amazon
