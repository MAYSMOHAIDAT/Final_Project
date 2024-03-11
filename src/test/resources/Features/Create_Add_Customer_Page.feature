
   @regresion
   Feature: Customers Managment
   
   Background:
   Given As a "level1" user, I am logged in
   And I navigate to Customers tab
   Then I should be on the " Customers" page
  
   
   @Coustomer_UI_Components
   Scenario: Verify Customers page UI Components
             And i should see Customer tab 
             And i should see Customer title
             And i should see path Home/Customers
             And i should see Filter button
             And i should see  New Customer button
             And i should see table with titel name,phon,Amount due,added on
            

   
   @Validat_Basic_Info
   Scenario: As a user I can create Customer and Manage customer
   And I click  +New Customer button
   Then I should be on the  New Customer page
   And i should see basic info field
   When i leave Diplay name empty ,i see field is required message
   When i insert incorrect email format i see incorrect email message
   When i add incorrect website format i see invalid url error message
   When i add Valid input for required fields Name "Zerix"
   And  I click Save Customer button
   Then I should be on the  Sales & Expenses page
   And user see "Success!" message displays
   
   
   @Validat_portal_access
   Scenario: As a user I can create Customer and Manage customer
   And I click  +New Customer button
   Then I should be on the  New Customer page
   When i active Toggle switch i see text Customer Portal Login URL 
   And i should see Password and confirm password field
   When i provid invalid data to password i see "Password must contain 8 characters"
   And see "Passwords must be identical" when i enter different password 
   
   
   @Validat_billing_address
    Scenario: As a user I can create Customer and Manage customer
    And I click  +New Customer button
    Then I should be on the  New Customer page
    Then I can see billing address section
    And  I can see fields: Name,State,City,Country,Address Street1,Address Street1,Zipcode
    
   
   @Validat_shipping_address
    Scenario: As a user I can create Customer and Manage customer
    And I click  +New Customer button
    Then I should be on the  New Customer page
    When I click on button copy from billing , copy from billing section
    
   
   
   @Validat_Add_customer_Successful
   @Verify_Add_Customer_to_table. 
    Scenario: As a user I can create Customer and Manage customer
    And I click  +New Customer button
    Then I should be on the  New Customer page
    When i add Valid input for required fields Name "Zerix"
    And  I click Save Customer button
    Then I should be on the  Sales & Expenses page
    And user see "Success!" message displays
    Then The customer is added to the customer list table
   
   
   
   
   @Validate_Edit_Customers
    Scenario: As a user I can create Customer and Manage customer
    And I click  +New Customer button
    Then I should be on the  New Customer page
    When i add Valid input for required fields Name "Zerix"
    And  I click Save Customer button
    Then I should be on the  Sales & Expenses page
    And user see "Success!" message displays
    Then The customer is added to the customer list table
    
    Then I should be able to select givin customer
    And I can be able to update customer info, and save it
    And user see "Success!" message displays
    Then I should be on the  Sales & Expenses page
    
    @Validate_View_Customers
   Scenario: As a user I can create Customer and Manage customer
   Then I should be able to select givin customer
   And I can able to View given Customer
   Then I should be on the  Sales & Expenses page
    
    
   
   
   @Validate_Delelte_Customers
    Scenario: As a user I can create Customer and Manage customer
    Then I should be able to select givin customer
    And I can able to delete given Customer
    Then I should be on the " Customers" page
  