#Author: Sudesh K
Feature: Test GET Restful API

  Background: 
    * url baseURL

  Scenario: Fetch all users
    Given path '/employees'
    When method GET
    Then status 200

  Scenario: Fetch single user
    Given path '/employee/17575'
    When method GET
    Then status 200
    And match $.id == '17575'