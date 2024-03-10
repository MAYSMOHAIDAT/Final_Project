package steps_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Access_control_page;
import pages.Dashboard_page;
import pages.customer_page;
import utils.BrowserUtils;
import utils.Driver;

public class Create_add_customer_steps {

	Access_control_page acp = new Access_control_page();
	Dashboard_page dash_page = new Dashboard_page();
	BrowserUtils utils = new BrowserUtils();
	customer_page custom_p=new customer_page();
	
	
	String Display_name="";
	String Email="";
	
	
	
	@Given("As a {string} user, I am logged in")
	public void as_a_user_i_am_logged_in(String user_type) {
		acp.login(user_type);
	}

	@Given("I navigate to Customers tab")
	public void i_navigate_to_customers_tab() {
		dash_page.Customer_tab.click();
		utils.waitUntilUrlContains("customers");
		Assert.assertTrue(custom_p.customers_customers_text.isDisplayed());
		
		Assert.assertTrue(custom_p.customers_home_text.isDisplayed());
		Assert.assertTrue(custom_p.customers_new_customer_button.isDisplayed());
		Assert.assertTrue(custom_p.customers_name_table_text.isDisplayed());
		Assert.assertTrue(custom_p.customers_name_table_phon.isDisplayed());
		Assert.assertTrue(custom_p.customers_name_table_Amount_Due.isDisplayed());
    	Assert.assertTrue(custom_p.customers_page_3dot_menu.isDisplayed());
    	Assert.assertTrue(custom_p.customers_filter_button.isDisplayed());
	}
	
	@Then("I click  New Customer button")
	public void i_click_new_customer_button() {
		utils.clickWithActionsClass(custom_p.customers_new_customer_button);
	
	}
	
	@Then("I should be on New Customer page")
	public void i_should_be_on_new_customer_page() {
	   utils.waitUntilUrlContains("customers/create");
	   Assert.assertTrue(custom_p.customers_new_customers_text.isDisplayed());
	}

	
	@When("I provide displayName {string} Email {string} Primary Currency {string} Prefix {string} Primary Contact Name {string} Phone {string} Website {string}")
	public void i_provide_display_name_email_primary_currency_prefix_primary_contact_name_phone_website(String display_name, String email, String primary_currency, String prefix, String primary_contact_name, String phone, String website) {
	Display_name=display_name+utils.randomNumber();	
  	Email=utils.randomNumber()+email;
	custom_p.customers_display_name_textbox.sendKeys(Display_name);
	custom_p.customers_email_textbox.sendKeys(Email);
	custom_p.currencyDropDownButton.click();
	custom_p.customers_prefix_textbox.sendKeys(prefix);
	custom_p.customers_primary_contact_name.sendKeys(website);
	custom_p.customers_phon_textbox.sendKeys(phone);
	custom_p.customers_website_textbox.sendKeys(website);
	
	
		
		
	}
	
	

	@When("I click save Customer button")
	public void i_click_save_customer_button() {
	custom_p.customers_save_customer_button.click();
	}
	
	@Then("The customer is added to the customer list table")
	public void the_customer_is_added_to_the_customer_list_table() throws InterruptedException {
		Thread.sleep(2000);
		dash_page.Customer_tab.click();
		custom_p.customers_Filter_btn.click();
		utils.waitForElementToBeVisible(custom_p.customers_Filter_display_name);
		custom_p.customers_Filter_display_name.sendKeys(Display_name);
		Thread.sleep(500);
		utils.waitUntilElementVisibleWithLocator(By.xpath("//a[text()='"+Display_name+"']"));
		
	    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[text()='"+Display_name+"']")).isDisplayed());
	}
	
		
		
	    
	}





