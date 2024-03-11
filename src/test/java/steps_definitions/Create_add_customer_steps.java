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
	
	
	String Entered_name="";
	
	
	
	
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


	
	
	//@Validat_Basic_Info
	
	@Then("I click  +New Customer button")
	public void i_click_new_customer_button() throws InterruptedException {
		custom_p.customers_new_customer_button.click();
		Thread.sleep(500);
		
		
	}
	
	@Then("I should be on the  New Customer page")
	public void i_should_be_on_the_new_customer_page() {
		utils.waitUntilUrlContains("customers/create");
		utils.waitForElementToBeVisible(custom_p.customers_new_customers_text);
	}

	

	@Then("i should see basic info field")
	public void i_should_see_basic_info_field() {
		Assert.assertTrue(custom_p.customers_Basic_Info_text.isDisplayed());
	}

	@When("i leave Diplay name empty ,i see field is required message")
	public void i_leave_diplay_name_empty_i_see_field_is_required_message() {
       custom_p.customers_save_customer_button.click();
       Assert.assertTrue(custom_p.fieldisRequiredErrorMessage.isDisplayed());
	}

	@When("i insert incorrect email format i see incorrect email message")
	public void i_insert_incorrect_email_format_i_see_incorrect_email_message() {
	custom_p.customers_email_textbox.sendKeys("invalid_email.com");
	utils.waitForElementToBeVisible(custom_p.incorrectEmailMessage);
	Assert.assertTrue(custom_p.incorrectEmailMessage.isDisplayed());
	
	}

	@When("i add incorrect website format i see invalid url error message")
	public void i_add_incorrect_website_format_i_see_invalid_url_error_message() {
	    custom_p.customers_website_textbox.sendKeys("www.invalid.com");
	    utils.waitForElementToBeVisible(custom_p.websiteErrormessage);
	    Assert.assertTrue(custom_p.websiteErrormessage.isDisplayed());
	}
	
	
	@When("i add Valid input for required fields Name {string}")
	public void i_add_valid_input_for_required_fields_name(String name) {
    
    custom_p.customers_display_name_textbox.sendKeys(name);
    Entered_name=name;
	custom_p.customers_email_textbox.sendKeys(utils.randomNumber()+"mmm@yahoo.com");
	custom_p.customers_website_textbox.clear();
	custom_p.customers_website_textbox.sendKeys("http://google.com");
	
    
	}

	@When("I click Save Customer button")
	public void i_click_save_customer_button() {
		custom_p.customers_save_customer_button.click();
	}
	
	

	
	@Then("I should be on the  Sales & Expenses page")
	public void i_should_be_on_the_sales_expenses_page() {
		utils.waitUntilUrlContains("/view");
		custom_p.customer_customer_view_sales_and_expenses.isDisplayed();
	}



	//Validat_portal_access
	@When("i active Toggle switch i see text Customer Portal Login URL")
	public void i_active_toggle_switch_i_see_text_customer_portal_login_url() {
		custom_p.Customer_Toggle.click();
		Assert.assertTrue(custom_p.customer_customerPortalUrlHeader.isDisplayed());
	}

	
	
	
  
	@When("i should see Password and confirm password field")
	public void i_should_see_password_and_confirm_password_field() {
	 custom_p.customer_password_fileld.isDisplayed();
	 custom_p.customer_Confirm_Password_fileld.isDisplayed();
	}

	@When("i provid invalid data to password i see {string}")
	public void i_provid_invalid_data_to_password_i_see(String error_mess) {
		custom_p.customer_password_fileld.sendKeys("125");
    	Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[text()='"+error_mess+"']")).isDisplayed());
	}

	@When("see {string} when i enter different password")
	public void see_when_i_enter_different_password(String confirm_field_error) {
		custom_p.customer_Confirm_Password_fileld.sendKeys("12586");
		utils.waitUntilElementVisibleWithLocator(By.xpath("//span[text()='"+confirm_field_error+"']"));
	}



	
	 //Validat_billing_address
	@Then("I can see billing address section")
	public void i_can_see_billing_address_section() {
		custom_p.customer_Billing_address_text.isDisplayed();
	}

	@Then("I can see fields: Name,State,City,Country,Address Street1,Address Street1,Zipcode")
	public void i_can_see_fields_name_state_city_country_address_street1_address_street1_zipcode() {
		custom_p.customer_Billing_address_name_text.isDisplayed();
		custom_p.customer_Billing_address_stata_text.isDisplayed();
		custom_p.customer_Billing_address_City_text.isDisplayed();
		custom_p.customer_Billing_address_Address1_text.isDisplayed();
		custom_p.customer_Billing_address_Address2_text.isDisplayed();
		custom_p.customer_Billing_address_zip_text.isDisplayed();
	}

	
	
	
	//Validat_shipping_address
	@When("I click on button copy from billing , copy from billing section")
	public void i_click_on_button_copy_from_billing_copy_from_billing_section() {
		custom_p.customer_copy_from_billing_button.click();
	}




	   //Validat_Add_customer_Successful
	   //Verify_Add_Customer_to_table.
	
	@Then("The customer is added to the customer list table")
	public void the_customer_is_added_to_the_customer_list_table() throws InterruptedException {
		
		dash_page.Customer_tab.click();
		Thread.sleep(500);
		utils.waitUntilElementVisibleWithLocator(By.xpath("//span[text()='"+Entered_name+"']"));
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[text()='"+Entered_name+"']")).isDisplayed());
		dash_page.Customer_tab.click();
		utils.waitUntilUrlContains("customers");
		Thread.sleep(500);
		custom_p.customers_page_3dot_menu.click();
		custom_p.customers_page_3dot_edit_option.click();
		
		
		 
	}
	
	 //Validate_Edit_Customers
	
	@Then("I should be able to select givin customer")
	public void i_should_be_able_to_select_givin_customer() throws InterruptedException {
		
		
	  
	  
	  
	}

	@Then("I can be able to update customer info, and save it")
	public void i_can_be_able_to_update_customer_info_and_save_it() throws InterruptedException {
		utils.waitUntilUrlContains("/edit");
		Thread.sleep(1000);
		utils.waitForElementToBeVisible(custom_p.customers_display_name_textbox);
		custom_p.customers_display_name_textbox.clear();
		custom_p.customers_display_name_textbox.sendKeys("New Zerix");
		custom_p.customer_customer_update_customer_button.click();
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





