package StepDefinition;



import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import apiReusables.APICommonMethods;
import apiReusables.APIConstants;
import apiReusables.SerializeDeserialize;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import loginResponse.LoginResponse;
import requestPOJOs.LoginRequest;
import requestPOJOs.Login_Token_Request;

public class LoginAPIStep {

	Login_Token_Request tokenRequestBody = new Login_Token_Request();
	APICommonMethods common = new APICommonMethods();
	RequestSpecification request = null;
	Response response = null;

	public static String bearerToken = null;
	public static String jwtToken = null;
	public static String TokenForLogin = null;
	public static String sessionID = null;
	public String resource = null;
	public LoginResponse loginResponse;

	@Given("I have the base URI as \"([^\"]*)\"$")
	public void i_have_the_base_uri_as(String baseURI) {
		try {
			RestAssured.baseURI = baseURI;

			request = RestAssured.given();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	@Given("resource as \"([^\"]*)\"$")
	public void resource_as(String resourcePath) {
		resource = resourcePath;

	}
	@When("I add the headers as")
	public void i_add_the_headers_as(DataTable dataTable) {
		request.headers(common.authentication);
		List<List<String>> data = dataTable.asLists();
		Map<String, String> headers = new HashMap<>();
		headers.put(data.get(1).get(0), data.get(1).get(1));
		headers.put(data.get(2).get(0), data.get(2).get(1));
		request.headers(headers);
	}
	@And("body as string {string}")
	public void bodyAsString(String requestBody) throws Throwable {
		request.body(requestBody);
	}
	@And("^send the Post Request$")
	public void sendThePostRequest() {
		response = request.post(resource);
	}

	@Then("^status code should be (\\d+)$")
	public void statusCodeShouldBe(int statusCode) {
//		assertEquals(statusCode, response.getStatusCode());
		assertEquals(response.getStatusCode(),statusCode);




	}

	@And("^I get the bearer token by joining the values path \"([^\"]*)\" and \"([^\"]*)\" with a space between them$")
	public void iGetTheBearerTokenByJoiningTheValuesPathAndWithASpaceBetweenThem(String path1, String path2)
			throws Throwable {
		String bearer = response.body().jsonPath().get(path1);
		String value = response.body().jsonPath().get(path2);
		bearerToken = bearer + " " + value;
		bearerToken = bearerToken.trim();
//        common.log(bearerToken);

	}

	@When("I set the headers as")
	public void iSetTheHeadersAs(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		Map<String, String> headers = new HashMap<String, String>();
		headers.put(data.get(1).get(0), bearerToken);
		headers.put(data.get(2).get(0), data.get(2).get(1));
		headers.put(data.get(3).get(0), data.get(3).get(1));
		request.headers(headers);
	}

	@And("^I send the Post request using the resuorce \"([^\"]*)\" and body with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void iSendThePostRequestUsingTheResuorceAndBodyWithUsernameAndPassword(String resource, String username,
			String password)
	{
		tokenRequestBody.setUsername(username);
		tokenRequestBody.setPassword(password);
		request.body(tokenRequestBody);
		response = request.relaxedHTTPSValidation().post(resource);
	}

	@And("^I fetch the JWT token using path \"([^\"]*)\"$")
	public void iFetchTheJWTTokenUsingPath(String path) throws Throwable {
		TokenForLogin = response.body().jsonPath().get(path);
		TokenForLogin = TokenForLogin.trim();
	}

	@Given("^I have the base URL for Login as \"([^\"]*)\"$")
	public void iHaveTheBaseURLForLoginAs(String baseURL) throws Throwable {
		RestAssured.baseURI = baseURL;
		request = RestAssured.given();
	}

	@And("^resource path as \"([^\"]*)\"$")
	public void resourcePathAs(String resourcePath) throws Throwable {
		resource = resourcePath;
	}

	@When("^I send the post request with body as$")
	public void iSendThePostRequestWithBodyAs(DataTable dataTable) {
		Map<String, String> body = dataTable.asMap(String.class, String.class);
		String authType = body.get("authType");
		String userCD = body.get("userCd");
		String deviceToken = body.get("deviceToken");
		String message = TokenForLogin;
		LoginRequest loginRequest = new LoginRequest(authType, userCD, deviceToken, message);
		request.body(loginRequest);
	}

	@And("^headers as$")
	public void headersAs(DataTable dataTable) {
		List<List<String>> headers = dataTable.asLists(String.class);
		Map<String, String> headersMap = new HashMap<>();
		headersMap.put(headers.get(1).get(0).trim(), headers.get(1).get(1).trim());
		headersMap.put(headers.get(2).get(0).trim(), bearerToken.trim());
		headersMap.put(headers.get(3).get(0).trim(), headers.get(3).get(1).trim());
		request.headers(headersMap);
		response = request.post(resource);
	}

	@Then("^I get the response code as (\\d+)$")
	public void iGetTheResponseCodeAs(int expectedStatusCode) {
		loginResponse = (LoginResponse) SerializeDeserialize.serialize(response, LoginResponse.class);

		int actualStatusCode = response.getStatusCode();

		assertEquals(expectedStatusCode, actualStatusCode);
		jwtToken = response.header("X-AUTH-JWT");
		sessionID = response.header("X-Session-ID");

		common.authentication.put(APIConstants.JWT_Token, jwtToken);
		common.authentication.put(APIConstants.BearerToken, bearerToken);
		common.authentication.put(APIConstants.Session_Id, sessionID);
		common.authentication.put(APIConstants.TargetEnvironment, "OC-FXONE");
		common.authentication.put(APIConstants.ContentType, "application/json");
	}
}
