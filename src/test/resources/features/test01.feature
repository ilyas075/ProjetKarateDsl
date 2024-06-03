@montag

Feature: test_api
  Scenario: test_01
    Given url urlServeur
    When method GET
    Then status 200
    And print response[0]
    And match response[0].userId == 1
