
@login
Feature: User Should be able to interact with login page

Background:
  Given I am crater user , I navigate to Crater Login page


@LoginUI
Scenario: Verify Login Page UI Components 
          And the textbox with  title "Email "
          And the textbox with title "password "
          And the link ‘Forgot Password?’
          And the button with text "login"
          And a heading with text ‘Simple Invoicing for Individuals Small Businesses’
          And a heading with text ‘Crater helps you track expenses, record payments & generate beautiful invoices & estimates’
          

@Valid_login
Scenario: As a user i should be able to login with valid password and valid username
          And enter valid email and pasword
          And click on the login button
          Then user should be on the " Dashboard" page
          And user see "Success!" message displays


 @invalid_login_outline
   Scenario Outline: As a user i should not be able to login with invalid credentials
   When i enter invalid username "<username>" and password "<password>"
   And click on the login button 
   Then user should not be logged in 
   
   Examples:
   |username                     |password        |
   |notrael@prim.com             |notrael         |
   |notrael@prim.com             |                |
   |dummy@primetechschool.com    |notrael         |
   |                             |primetech@school|
   |                             |                |
   |                             |notrael         |
   |notrael@prim.com             |primetech@school|
   |dummy@primetechschool.com    |                |
   



