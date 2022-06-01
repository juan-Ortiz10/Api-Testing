#Author: Camilo Ortiz
Feature: Add two numbers on the dneonline service
  As a user, I want to add to numbers

  Scenario: Add two numbers
    When you add two numbers
    |2|4|
    Then I should see the response of the service is 200