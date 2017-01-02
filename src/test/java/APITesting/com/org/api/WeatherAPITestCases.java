package APITesting.com.org.api;

import org.testng.Assert;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WeatherAPITestCases {

	private Response resp;
	
	
	@When("^I send request sedning city name with a valid token$")
	public void Test_01_Get_Weather_By_Country_And_CityName_With_Val() throws Throwable
	{
		        resp = when().	
				get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=c23b52905e3a16ddf5f0ee7e82d8435a");


	}
	
	@Then("^I get the weather response for the given city and response code 200$")
	public void VerifyResponse() throws Throwable
	{
	
				resp.then().assertThat().statusCode(200);
		
	}

}
