$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APITesting/com/org/api/Weather_API_Testing.feature");
formatter.feature({
  "line": 1,
  "name": "Weather_API_Testing",
  "description": "",
  "id": "weather-api-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get Weather using City Name",
  "description": "",
  "id": "weather-api-testing;get-weather-using-city-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I send request sedning city name with a valid token",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I get the weather response for the given city and response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherAPITestCases.Test_01_Get_Weather_By_Country_And_CityName_With_Val()"
});
formatter.result({
  "duration": 1408521194,
  "status": "passed"
});
formatter.match({
  "location": "WeatherAPITestCases.VerifyResponse()"
});
formatter.result({
  "duration": 24201119,
  "status": "passed"
});
});