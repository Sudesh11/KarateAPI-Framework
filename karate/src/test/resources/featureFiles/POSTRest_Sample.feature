#Author: your.email@your.domain.com

Feature: Test POST Restful API

  Background: 
    * url baseURL
    
    
	Scenario: To send POST request
		Given path '/create'
		And request {"name":"Sud","salary":"123","age":"23"}
		When method POST
		Then status 200
		And match $.name == "Sud"