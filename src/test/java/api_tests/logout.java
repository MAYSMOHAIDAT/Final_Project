package api_tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.DataReader;

public class logout {

	
	String token;
	String baseurl = "http://crater.primetech-apps.com";
	Response response;   
	
	@Test
	
	public void login_test() {

		String body="{\r\n"
		+ " \"username\"   : \""+DataReader.getProperty("username")+"\",\r\n"
		+ " \"password\"   : \""+DataReader.getProperty("password")+"\",\r\n"
    	+ "\"device_name\" : \"mobile_app\"\r\n"
		+ "}";
		
		Response response=RestAssured
	    .given().contentType("application/json").body(body)
		.when().post(baseurl+"/api/v1/auth/login");
		response.prettyPrint();
		token=response.jsonPath().get("token");
		
		response.then().statusCode(200).contentType("application/json");
	
}
	
	
	
	
	
	
	@Test(dependsOnMethods="login_test")
	public void logout_test()
	{
		
		Response response=RestAssured
		.given().contentType("application/json").auth().oauth2("Bearer "+ token)
		.when().post(baseurl+"/api/v1/auth/logout");
		response.prettyPrint();
		response.then().statusCode(200).contentType("application/json");
		
	}
	
	
	
	@Test(dependsOnMethods="login_test")
	public void logout_test_UNAuthorization()
	{
		Response response=RestAssured
		.given().contentType("application/json")
		.when().post(baseurl+"/api/v1/auth/logout");
		response.prettyPrint();
//		response.then().statusCode(401).contentType("application/json");
		
		
	}
	


}
