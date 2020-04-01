package functions;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import readConfiguration.ReadConfig;

public class stepDef extends reusableFunctions{
	Response res;
	String URL, URI, endPoint;
	ReadConfig read = ReadConfig.getInstance();
	
	
	@Given("the baseURI is {string}")
	public void the_baseURI_is(String string) {
		setBaseURI(read.getBaseURI(string));
		newRequest();
	}

	@When("the endpoint is {string}")
	public void the_endpoint_is(String string) {
		sendEndPoint(read.getEndpoint(string));
	}
	
	
	@When("the user sends a get request on {string}")
	public void the_user_sends_a_get_request_on(String string) {
		sendPath(read.getPath(string));
	}

	@Then("the response code should be {int}")
	public void the_response_code_should_be(Integer int1) {
		validateStatusCode(int1);
	}

	@Then("show the response data")
	public void show_the_response_data() {
		System.out.println(showResponse());
	}

	
	@When("the following data:")
	public void the_following_data(Map<String,String> dataTable) {
		jsonBuilder(dataTable);
	}
	@When("the user sends a post request on {string}")
	public void the_user_sends_a_post_request_on(String string) {
		sendPost(read.getPath(string));
	}

}
