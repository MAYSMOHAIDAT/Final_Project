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
	}
	
	
	@Then("I should be on the {string} page")
	public void i_should_be_on_the_page(String Customers) {
		
		utils.waitUntilUrlContains("customers");
		Assert.assertTrue(custom_p.customers_customers_text.isDisplayed());}
	
	
	@Then("i should see Customer tab")
	public void i_should_see_customer_tab() {
		Assert.assertTrue(dash_page.Customer_tab.isDisplayed());}
	
	
	
	@Then("i should see Customer title")
	public void i_should_see_customer_title() {
	 Assert.assertTrue(custom_p.customers_customers_text.isDisplayed());
	}

	@Then("i should see path Home\\/Customers")
	public void i_should_see_path_home_customers() {
	  Assert.assertTrue(custom_p.customers_home_text_path.isDisplayed());
	}

	@Then("i should see Filter button")
	public void i_should_see_filter_button() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(custom_p.customers_filter_button.isDisplayed()); 
	}

	@Then("i should see  New Customer button")
	public void i_should_see_new_customer_button() {
		Assert.assertTrue(custom_p.customers_new_customer_button.isDisplayed());
	}

	@Then("i should see table with titel name,phon,Amount due,added on")
	public void i_should_see_table_with_titel_name_phon_amount_due_added_on() {
		Assert.assertTrue(custom_p.customers_name_table_text.isDisplayed());
		Assert.assertTrue(custom_p.customers_name_table_phon.isDisplayed());
		Assert.assertTrue(custom_p.customers_name_table_Amount_Due.isDisplayed());
		Assert.assertTrue(custom_p.customers_name_table_added_on.isDisplayed());
	}


	
	
	
	
	
	
	
	
	
	

	

	

	@When("{string} message displays")
	public void message_displays(String string) {
	   
	}

	@Then("as user i can update given customer")
	public void as_user_i_can_update_given_customer() {
	 
	}

	@Then("and i should be in Edit Customer page")
	public void and_i_should_be_in_edit_customer_page() {
	    
	}

	@Then("as a user i can verify i edit given customer")
	public void as_a_user_i_can_verify_i_edit_given_customer() {
	   
	}

	@Then("as user i can view customer")
	public void as_user_i_can_view_customer() {
	   
	}

	@Then("as user i can delete customer")
	public void as_user_i_can_delete_customer() {
	   
	}

	@When("I click on Filter Icon.")
	public void i_click_on_filter_icon() {
	   
	}

	@When("I type value in the contact name field, the matching result should return")
	public void i_type_value_in_the_contact_name_field_the_matching_result_should_return() {
	
	}

	@When("I click clear all, application will display current list of customer")
	public void i_click_clear_all_application_will_display_current_list_of_customer() {
	  
	}

	@When("I click on Filtter Icon again")
	public void i_click_on_filtter_icon_again() {
	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Then("I click  New Customer button")
//	public void i_click_new_customer_button() {
//		utils.clickWithActionsClass(custom_p.customers_new_customer_button);
//	
//	}
//	
//	@Then("I should be on New Customer page")
//	public void i_should_be_on_new_customer_page() {
//	   utils.waitUntilUrlContains("customers/create");
//	   Assert.assertTrue(custom_p.customers_new_customers_text.isDisplayed());
//	}
//
//	
//	@When("I provide displayName {string} Email {string} Primary Currency {string} Prefix {string} Primary Contact Name {string} Phone {string} Website {string}")
//	public void i_provide_display_name_email_primary_currency_prefix_primary_contact_name_phone_website(String display_name, String email, String primary_currency, String prefix, String primary_contact_name, String phone, String website) {
//	Display_name=display_name+utils.randomNumber();	
//  	Email=utils.randomNumber()+email;
//	custom_p.customers_display_name_textbox.sendKeys(Display_name);
//	custom_p.customers_email_textbox.sendKeys(Email);
//	custom_p.currencyDropDownButton.click();
//	custom_p.customers_prefix_textbox.sendKeys(prefix);
//	custom_p.customers_primary_contact_name.sendKeys(website);
//	custom_p.customers_phon_textbox.sendKeys(phone);
//	custom_p.customers_website_textbox.sendKeys(website);
//	
//	
//		
//		
//	}
//	
//	
//
//	@When("I click save Customer button")
//	public void i_click_save_customer_button() {
//	custom_p.customers_save_customer_button.click();
//	}
//	
//	@Then("The customer is added to the customer list table")
//	public void the_customer_is_added_to_the_customer_list_table() throws InterruptedException {
//		Thread.sleep(2000);
//		dash_page.Customer_tab.click();
//		custom_p.customers_Filter_btn.click();
//		utils.waitForElementToBeVisible(custom_p.customers_Filter_display_name);
//		custom_p.customers_Filter_display_name.sendKeys(Display_name);
//		Thread.sleep(500);
//		utils.waitUntilElementVisibleWithLocator(By.xpath("//a[text()='"+Display_name+"']"));
//		
//	    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[text()='"+Display_name+"']")).isDisplayed());
//	}
//	
//		
//		
//	    
//	}





