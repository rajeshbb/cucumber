$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./feature/addcustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Customers",
  "description": "",
  "id": "customers",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13303129000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are the common steps for each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Lanuch  chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens Url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_Lanuch_chrome_browser()"
});
formatter.result({
  "duration": 1784311600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 4649329300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 423068800,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_login()"
});
formatter.result({
  "duration": 12210906500,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_can_view_Dashboad()"
});
formatter.result({
  "duration": 28661500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add new customer",
  "description": "",
  "id": "customers;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on customers menu  item",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on add new buttton",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user can view add new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter customer info",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 134341800,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_customers_menu_item()"
});
formatter.result({
  "duration": 3214995900,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_add_new_button()"
});
formatter.result({
  "duration": 5584743100,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_can_view_add_new_customer_page()"
});
formatter.result({
  "duration": 35188200,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_enter_customer_info()"
});
formatter.result({
  "duration": 8508721300,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_save_button()"
});
formatter.result({
  "duration": 3137495800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 36
    }
  ],
  "location": "steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "duration": 3360957000,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_browser()"
});
formatter.result({
  "duration": 3179949000,
  "status": "passed"
});
formatter.before({
  "duration": 1784663700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are the common steps for each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Lanuch  chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens Url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_Lanuch_chrome_browser()"
});
formatter.result({
  "duration": 83700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 7583859500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 398580900,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_login()"
});
formatter.result({
  "duration": 7702500300,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_can_view_Dashboad()"
});
formatter.result({
  "duration": 34973400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "search customer by EMailID",
  "description": "",
  "id": "customers;search-customer-by-emailid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "click on customers menu  item",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Enter the email",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user should found email in search table",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 113979100,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_customers_menu_item()"
});
formatter.result({
  "duration": 4524785700,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_the_email()"
});
formatter.result({
  "duration": 369227200,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_search_button()"
});
formatter.result({
  "duration": 3201822000,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_should_found_email_in_search_table()"
});
formatter.result({
  "duration": 110514300,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_browser()"
});
formatter.result({
  "duration": 4297527800,
  "status": "passed"
});
formatter.before({
  "duration": 2520972200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are the common steps for each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Lanuch  chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens Url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_Lanuch_chrome_browser()"
});
formatter.result({
  "duration": 54900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 7396121700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 482005200,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_login()"
});
formatter.result({
  "duration": 6447597600,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_can_view_Dashboad()"
});
formatter.result({
  "duration": 31810600,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "search customer by Name",
  "description": "",
  "id": "customers;search-customer-by-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "click on customers menu  item",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Enter the firstname",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enter the lastname",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user should found name in the search table",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 126614100,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_customers_menu_item()"
});
formatter.result({
  "duration": 3663276600,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_the_firstname()"
});
formatter.result({
  "duration": 215117100,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_the_lastname()"
});
formatter.result({
  "duration": 219451700,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_search_button()"
});
formatter.result({
  "duration": 3172242400,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_should_found_name_in_the_search_table()"
});
formatter.result({
  "duration": 126138700,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_browser()"
});
formatter.result({
  "duration": 1044083400,
  "status": "passed"
});
formatter.before({
  "duration": 3578689600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are the common steps for each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Lanuch  chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens Url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_Lanuch_chrome_browser()"
});
formatter.result({
  "duration": 68900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 6932081500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 384101500,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_login()"
});
formatter.result({
  "duration": 8574011500,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_can_view_Dashboad()"
});
formatter.result({
  "duration": 26967200,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Search customer role",
  "description": "",
  "id": "customers;search-customer-role",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "user click on customer menu",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "click on customer menu  item",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "click on new  button role",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user can view add  new customer role page",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "user enter info",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "click on product",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "click chooseproduct",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "enter the systetm name",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "click on save",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user confirmation message \"The new customer role has been added successfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_on_customer_menu()"
});
formatter.result({
  "duration": 125415600,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_customerrole_menu_item()"
});
formatter.result({
  "duration": 2798153400,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_add_new()"
});
formatter.result({
  "duration": 2809975200,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_can_view_add_new_customer_role_page()"
});
formatter.result({
  "duration": 22054000,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_enter_info()"
});
formatter.result({
  "duration": 163233000,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_product()"
});
formatter.result({
  "duration": 3286206700,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_chooseproduct()"
});
formatter.result({
  "duration": 3056801400,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_the_systetm_name()"
});
formatter.result({
  "duration": 122581100,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_save()"
});
formatter.result({
  "duration": 7877781800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer role has been added successfully",
      "offset": 27
    }
  ],
  "location": "steps.user_confirmation_message(String)"
});
formatter.result({
  "duration": 3228379300,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_browser()"
});
formatter.result({
  "duration": 1874332700,
  "status": "passed"
});
});