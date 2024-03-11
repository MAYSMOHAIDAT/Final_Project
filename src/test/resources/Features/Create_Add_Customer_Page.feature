

   Feature: Customers Managment
   
   Background:
   Given As a "level1" user, I am logged in
   And I navigate to Customers tab
   Then I should be on the " Customers" page
  # And I click  New Customer button
   
   @Coustomer_UI_Components
   Scenario: Verify Customers page UI Components
             And i should see Customer tab 
             And i should see Customer title
             And i should see path Home/Customers
             And i should see Filter button
             And i should see  New Customer button
             And i should see table with titel name,phon,Amount due,added on
            

   
   
   
   @add_customer
   Scenario: Verify Add Customers page UI Components
   Then I should be on New Customer page
   When I provide displayName "moral" Email "moral@yahoo.com" Primary Currency "CZK - Czech Koruna" Prefix "emptyValue" Primary Contact Name "xcsca " Phone " 2561" Website "http://www.follwing.com"
   And I click save Customer button
   And "Success!" message displays
   Then The customer is added to the customer list table
   
   
    
    
   #Validate Edit Customers 
   Scenario: Verify Edit Customers 
  # Then as user i can update given customer 
   #And and i should be in Edit Customer page 
  # And as a user i can verify i edit given customer 
    
   
   
   #Validate View Customers 
 #  Scenario: Verify View Customers 
   #Then as user i can view customer  
   
   
   #Validate Delete Customer
   # Scenario: Verify delelte Customers
   #Then as user i can delete customer
   
   
   
  #Validate Filtter Customers 
  Scenario: Verify Filtter Customers
  #And I navigate to Customers tab
 # When I click on Filter Icon.
 # When I type value in the contact name field, the matching result should return    
 # When I click clear all, application will display current list of customer
  #When I click on Filtter Icon again
   
   
   
   