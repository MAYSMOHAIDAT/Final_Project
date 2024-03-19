package api_tests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.DataReader;

public class customer {
	
	
	String token;
	String baseurl = "http://crater.primetech-apps.com";
	Response response;
	int customer_id;
	
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
		public void list_customer()	
		{
		Response response=RestAssured
		.given().contentType("application/json")
		.auth().oauth2("Bearer "+ token)	
				
		.when().get(baseurl+"/api/v1/customers");
		 response.prettyPrint();
		 
		 response.then().statusCode(200).contentType("application/json");
			
		}
		
	
	
@Test(dependsOnMethods="login_test")

	public void craete_static_customer()
	{
		File body = new File("./src/test/resources/testfiles/create_customer.json");
		Response response=RestAssured
		
		.given().contentType("application/json")
		.auth().oauth2("Bearer "+ token).body(body)	
		
		.when().post(baseurl+"/api/v1/customers");
		 response.prettyPrint();
		
		 	
	}


@Test(dependsOnMethods="craete_static_customer")

public void delete_customer()
{
	String body=" {\r\n"
			+ "    \"ids\": ["+customer_id+"]\r\n"
			+ "}";
	
	
	Response response=RestAssured
	.given().auth().oauth2("Bearer "+ token).contentType("application/json")
	.body(body)
	.when().post(baseurl+"/api/v1/customers/delete");
	
	
}




}
