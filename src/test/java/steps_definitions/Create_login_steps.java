package steps_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Access_control_page;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;

public class Create_login_steps {
	
	Access_control_page acp=new Access_control_page();
	BrowserUtils utils=new BrowserUtils();
	
	
	//login_UI
	
	@Given("I am crater user , I navigate to Crater Login page")
	public void i_am_crater_user_i_navigate_to_crater_login_page() {
		Driver.getDriver().get(DataReader.getProperty("app_url"));
	}


	@Given("the textbox with  title {string}")
	public void the_textbox_with_title(String Email) {
		Assert.assertTrue(acp.login_username.isDisplayed());
	}

	@Given("the textbox with title {string}")
	public void the_textbox_with_title1(String Password) {
		Assert.assertTrue(acp.login_password.isDisplayed());
	}

	@Given("the link ‘Forgot Password?’")
	public void the_link_forgot_password() {
		Assert.assertTrue(acp.login_forgot_password_link.isDisplayed());
	}

	@Given("the button with text {string}")
	public void the_button_with_text(String login) {
		Assert.assertTrue(acp.login_loginBtn.isDisplayed());
	}

	@Given("a heading with text ‘Simple Invoicing for Individuals Small Businesses’")
	public void a_heading_with_text_simple_invoicing_for_individuals_small_businesses() {
		Assert.assertTrue(acp.heading1.isDisplayed());
	}

	@Given("a heading with text ‘Crater helps you track expenses, record payments & generate beautiful invoices & estimates’")
	public void a_heading_with_text_crater_helps_you_track_expenses_record_payments_generate_beautiful_invoices_estimates() {
		Assert.assertTrue(acp.heading2.isDisplayed());
	}


//valid login 
	
	@Given("enter valid email and pasword")
	public void enter_valid_email_and_pasword() {
		utils.sendkeysWithActionsClass(acp.login_username, DataReader.getProperty("username"));
		utils.sendkeysWithActionsClass(acp.login_password, DataReader.getProperty("password"));
	}

	@Given("click on the login button")
	public void click_on_the_login_button() {
		utils.clickWithActionsClass(acp.login_loginBtn);
	}

	@Then("user should be on the {string} page")
	public void user_should_be_on_the_page(String menu_item) {
		String classValue=Driver.getDriver().findElement(By.xpath("//a[text()='"+menu_item+"']")).getAttribute("class");
		Assert.assertTrue(classValue.contains("active"));
	}

	@Then("user see {string} message displays")
	public void user_see_message_displays(String successMessage) {
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[text()='"+successMessage+"']")).isDisplayed());
	}




	//invalid_login
	
	
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
