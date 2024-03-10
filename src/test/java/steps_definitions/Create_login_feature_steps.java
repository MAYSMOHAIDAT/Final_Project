package steps_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Access_control_page;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;

public class Create_login_feature_steps {
	
	Access_control_page acp=new Access_control_page();
	BrowserUtils utils=new BrowserUtils();
	
	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		utils.sendkeysWithActionsClass(acp.login_username, DataReader.getProperty("username"));
		utils.sendkeysWithActionsClass(acp.login_password, DataReader.getProperty("password"));
		
	 
	}

	@When("I click login button")
	public void i_click_login_button() {
		utils.clickWithActionsClass(acp.login_loginBtn);
	}

	@Then("I should be on the {string} page")
	public void i_should_be_on_the_page(String menu_item) {
		String classValue=Driver.getDriver().findElement(By.xpath("//a[text()='"+menu_item+"']")).getAttribute("class");
		Assert.assertTrue(classValue.contains("active"));
		
	    
	}

	@Then("{string} message displays")
	public void message_displays(String successMessage) {
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[text()='"+successMessage+"']")).isDisplayed());
	}



	//invalid login
	
	
	
	String userEmail;
	String userPassword;
	
	@When("i enter invalid username {string} and password {string}")
	public void i_enter_invalid_username_and_password(String username, String password) {
		userEmail=username;
		userPassword=password;
		utils.sendkeysWithActionsClass(acp.login_username,(username));
		utils.sendkeysWithActionsClass(acp.login_password,(password));
	}

	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() {
		Assert.assertTrue(acp.login_username.isDisplayed());
		Assert.assertTrue(acp.login_password.isDisplayed());
		Assert.assertTrue(acp.login_loginBtn.isDisplayed());
		
		
		if(userEmail==""|| userPassword=="")
		{
			utils.waitForElementToBeVisible(acp.login_field_is_required);
			Assert.assertTrue(acp.login_field_is_required.isDisplayed());}
		else {
			utils.waitForElementToBeVisible(acp.login_credentials_not_match_message);
			Assert.assertTrue(acp.login_credentials_not_match_message.isDisplayed());
		}
		
		
	}

	

}
