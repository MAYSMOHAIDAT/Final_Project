package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class customer_page {

	public customer_page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//h3[text()='Customers']")
	public WebElement customers_customers_text;
	
	@FindBy (xpath = "//button[text()=' New Customer']")
	public WebElement customers_new_customer_button;
	
	@FindBy (xpath = "//th[text()='Added On ']")
	public WebElement customers_name_table_added_on;
	
	
	
	@FindBy (xpath = "//button[text()='Filter ']")
	public WebElement customers_filter_button;
	
	
	@FindBy (xpath = "//ol[@class='flex flex-wrap py-4 text-gray-900 rounded list-reset']")
	public WebElement customers_home_text_path;
	
	
	@FindBy (xpath = "//th[text()='Name ']")
	public WebElement customers_name_table_text;
	
	@FindBy (xpath = "//th[text()='Phone ']")
	public WebElement customers_name_table_phon;
	
	@FindBy (xpath = "//th[text()='Amount Due ']")
	public WebElement customers_name_table_Amount_Due;
	
	
	@FindBy (id="headlessui-menu-button-5")
	public WebElement ThreeDotButton;
	
	
	 @FindBy (xpath = "(//button[contains(@id, 'headlessui-menu-button')])[3]")
	 public WebElement customers_page_3dot_menu;
	 
	 
	 @FindBy (xpath = "//h3[text()='New Customer']")
	 public WebElement customers_new_customers_text;
	 
	 @FindBy (xpath = "//button[text()=' Save Customer']")
	 public WebElement customers_save_customer_button;
	 
	 @FindBy (xpath="//span[text()='Field is required']")
	   public WebElement fieldisRequiredErrorMessage;
	 
	 
	 @FindBy (xpath="//span[text()='Incorrect Email.']")
	 public WebElement incorrectEmailMessage;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 @FindBy (xpath = "//h6[text()='Basic Info']")
	 public WebElement customers_Basic_Info_text;
	 
	 
	 @FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[1]/div/div[1]/div/div/input")
	 public WebElement customers_display_name_textbox;
	 
	 
	 @FindBy (xpath = "//input[@name='email']")
	 public WebElement customers_email_textbox;
	 
	 
	 @FindBy (xpath="//span[text()='Invalid url (ex: http://www.craterapp.com)']")
	 public WebElement websiteErrormessage;
	 
	 @FindBy (xpath="//div[text()='USD - US Dollar']/following::span[1]")
	public WebElement currencyDropDownButton;
	 
	 @FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[1]/div/div[7]/div/div/input")
	 public WebElement customers_prefix_textbox;
	 
	 
	 @FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	 public WebElement customers_primary_contact_name;
	 

	 @FindBy (xpath = "/html/body/div/main/div/div/form/div[2]/div/div[1]/div/div[4]/div/div/input")
	 public WebElement customers_phon_textbox;
	 
	 @FindBy (xpath = "//input[@type='url']")
	 public WebElement customers_website_textbox;
	 
	 @FindBy (xpath="//input[contains(@id,'check')]")
	 public WebElement customer_selectAllCheckBox;
	 
	 @FindBy (xpath="//h6[text()=' Sales & Expenses']")
	 public WebElement customer_customer_view_sales_and_expenses;
	 
	 @FindBy (xpath="//input[@name='password']")
	 public WebElement customer_password_fileld;
	 
	 @FindBy (xpath="//input[@name='confirm_password']")
	 public WebElement customer_Confirm_Password_fileld;
	 
	 @FindBy (xpath="//div[text()='Customer Portal Login URL ']")
	 public WebElement customer_customerPortalUrlHeader;
	
	 
	  @FindBy (xpath = "//button[text()='Filter ']")
	   public WebElement customers_Filter_btn;
	  
	  @FindBy (xpath = "/html/body/div/main/div/div/div[2]/div/div[1]/div/div/input")
	   public WebElement customers_Filter_display_name;
	  
	 
	  @FindBy (xpath = "//button[@modelvalue='false']")
	   public WebElement Customer_Toggle;
	  
	
	 
	  @FindBy (xpath = "//a[text()=' Edit']")
	    public WebElement customers_page_3dot_edit_option;
	 
	  
	  @FindBy (xpath = "//a[text()=' View']")
	   public WebElement customers_page_3dot_view_option;
	 
	 
	  @FindBy (xpath = "//a[text()=' Delete']")
	    public WebElement customer_page_3dot_delete_option;
	 
	 
	  @FindBy (xpath = "//h3[text()='Are you sure?']")
	    public WebElement customer_Input_delete_youSure_text;
	 
	 
	 
	  @FindBy (xpath = "//button[text()='Ok']")
	   public WebElement customer_page_delete_ok_btn;
	  
	  @FindBy (xpath="//input[contains(@id,'check')]")
	  public WebElement Customer_select_AllCheckBox;
	 
	  @FindBy (xpath="//*[@id=headlessui-menu-button-360]/span/svg/path)")
	  public WebElement Customer_delete_action;
	 

	  @FindBy (xpath="//a[text()=' Delete']")
	  public WebElement customer_delete_actin_btn;
	  
	 
	  
	  
	  @FindBy (xpath = "//h6[text()='Billing Address'] ")
	   public WebElement customer_Billing_address_text;
	  
	  @FindBy (xpath = " (//input[@name='address_name'])[1]")
	   public WebElement customer_Billing_address_name_text;
	
	  @FindBy (xpath = "(//input[@name='billing.state'])")
	   public WebElement customer_Billing_address_stata_text;
	  
	  
	  @FindBy (xpath = "//textarea[@name='billing_street1']")
	   public WebElement customer_Billing_address_Address1_text;
	  
	  
	  
	  @FindBy (xpath = "//textarea[@name='billing_street2']")
	  public WebElement customer_Billing_address_Address2_text;
	  
	 
	  @FindBy (xpath = "//input[@name='billing.city']")
	  public WebElement customer_Billing_address_City_text;
	  
	  @FindBy (xpath = "(//input[@name='phone'])[2]")
	  public WebElement customer_Billing_address_phone_text;
	
	  
	  @FindBy (xpath = "(//input[@name='zip'])[1]")
	  public WebElement customer_Billing_address_zip_text;
	  
	  
	  
	  @FindBy (xpath = "(//button[text()=' Copy from Billing'])")
	  public WebElement customer_copy_from_billing_button;
	  
	  @FindBy (xpath = " //button[text()=' Update Customer']")
	  public WebElement customer_customer_update_customer_button;
	  
	  
	  
	  
}
