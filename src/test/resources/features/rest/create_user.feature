# Author: Camilo Ortiz
Feature: Create an user on Regres.in
  As user, I want to create another user

  Scenario: Creation of an user
    When you create an user
    |name|job|
    |Brandon|Java|
    Then I should see the user created