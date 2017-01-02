Feature: Weather_API_Testing
	
	Scenario: Get Weather using City Name
			
			
			When  I send request sedning city name with a valid token
			Then  I get the weather response for the given city and response code 200
			
					
	