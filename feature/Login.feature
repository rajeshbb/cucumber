
Feature: Login

Scenario: Successful Login with Valid Credentials 
	Given User Lanuch  chrome browser 
	When User opens Url "https://admin-demo.nopcommerce.com/login"
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on login
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
  And close browser 
	
	
	
Scenario Outline: Login data driven
	Given User Lanuch  chrome browser 
	When User opens Url "https://admin-demo.nopcommerce.com/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on login
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
  And close browser
  
     Examples:
     | email | password |
     | admin@yourstore.com | admin123 | 