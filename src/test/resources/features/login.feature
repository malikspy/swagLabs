Feature: login as standard user

  Scenario: user login successfully
    Given : I open url saucedemo
    When I input username and password
    And I click login button
    Then I navigate to dashbord menu