Feature: Testing a dummy API
  Scenario Outline: Get all employees data	 
    Given the baseURI is "baseURI"
    When the endpoint is "endPoint"
    And the user sends a get request on "<path>"
    Then the response code should be <status>
    And show the response data
    Examples: 
      | 	path		|	status  |
			|	employees	|		200		|
			
	Scenario Outline: Create new record in database	
    Given the baseURI is "baseURI"
    When the endpoint is "endPoint"
    And the following data:
    	|		name	|	Shakti	|
    	|	salary	|	15000		|
    	|		age		|		24		|
    And the user sends a post request on "<path>"
    Then the response code should be <status>
    Examples: 
      | 	path		|	status  |
			|		create	|		200		|
	