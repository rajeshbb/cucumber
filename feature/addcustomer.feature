Feature: Customers 

 Background: Below are the common steps for each scenario
   Given  User Lanuch  chrome browser
    When User opens Url "http://admin-demo.nopcommerce.com/login" 
    And User enters Email as "admin@yourstore.com" and Password as "admin" 
    And click on login
    Then user can view dashboard
 
  Scenario: Add new customer
    When user click on customers menu
    And click on customers menu  item
    And click on add new buttton
    Then user can view add new customer page
    When user enter customer info
    And click on save button
    Then User can view confirmation message "The new customer has been added successfully." 
	 And close browser
    
    
   Scenario: search customer by EMailID 
   When user click on customers menu
   And click on customers menu  item
   And Enter the email
   When Click on search button
   Then user should found email in search table
   And close browser
   
  
   Scenario: search customer by Name
   When user click on customers menu
   And click on customers menu  item
   And Enter the firstname
   And Enter the lastname
   When Click on search button
   Then user should found name in the search table
   And close browser
   
   Scenario: Search customer role
   When user click on customer menu
   And  click on customer menu  item
   And click on new  button role
   Then user can view add  new customer role page
   When user enter info
   And click on product
   And click chooseproduct
   
   Then enter the systetm name
   Then click on save
   Then user confirmation message "The new customer role has been added successfully"
   And close browser