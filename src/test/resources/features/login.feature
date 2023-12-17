Feature: Login Feature

  Scenario: Add new account
    Given I am on the login page
    When I enter the username "a@a" and password "a"
    And I click the login button
    And I should be logged in
    And I click in contas
    And I click in adicionar
    And I type a name for the new account and click in save
    Then I make sure the account was created