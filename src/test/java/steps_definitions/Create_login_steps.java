package steps_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import pages.Access_control_page;
import utils.DataReader;
import utils.Driver;

public class Create_login_steps {
	
	Access_control_page acp=new Access_control_page();
	
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		Driver.getDriver().get(DataReader.getProperty("app_url"));
	}

	@Given("login page components exist")
	public void login_page_components_exist() {
		Assert.assertTrue(acp.login_username.isDisplayed());
		Assert.assertTrue(acp.login_password.isDisplayed());
		Assert.assertTrue(acp.login_loginBtn.isDisplayed());
		Assert.assertTrue(acp.login_forgot_password_link.isDisplayed());
	   
	}

}
