package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.addcustomer;
import pageobjects.customerroles;
import pageobjects.loginpage;
import pageobjects.searchcustomer;


public class steps  extends baseclass{

   static WebDriver driver;
	
	
	private static String chromepath="E://TESTING//automation1//18-08-cucumber//driver//chromedriver.exe";
	
	@Before
	
	
	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
	}
	
	@Given("^User Lanuch  chrome browser$")
	public void user_Lanuch_chrome_browser() throws Throwable {
	    lp=new loginpage(driver);
		
	   
	}

	@When("^User opens Url \"([^\"]*)\"$")
	public void user_opens_URL(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Given("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String email, String password) throws Throwable {
	  
		lp.setUserName(email);
		lp.setPassword(password);
	}
	
	

	@Given("^click on login$")
	public void click_on_login() throws Throwable {
	    lp.clicklogin();
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String exptitle) throws Throwable {
		
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(exptitle, driver.getTitle());
		}
	    Thread.sleep(3000);
	}

	@When("^User click on Log out link$")
	public void user_click_on_Log_out_link() throws Throwable {
		 lp.clicklogout();
		 Thread.sleep(3000);
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	  
		driver.quit();
	}
	
	//customer definations
	
	
@Then("^user can view dashboard$")
	
	public void  user_can_view_Dashboad() {
		 addcust = new addcustomer(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration",addcust.getPageTitle());
		
	}
	@When("^user click on customers menu$")
	public void user_click_on_customers_menu() {
		addcust.clickoncustomermenu();
	}
	
	@When("^click on customers menu  item$")
	public void click_on_customers_menu_item() {
		addcust.clickoncustomermenuitem();
	}
	
	@When("^click on add new buttton$")
	public void  click_on_add_new_button() throws Throwable {
		addcust.clickonaddnew();
		Thread.sleep(3000);
	}
	
	@Then("^user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getPageTitle());
	}
	
	@When("user enter customer info")
	
	public void user_enter_customer_info() throws Throwable {
		String email = randomstring() + "@gmail.com";
		addcust.setemail(email);
		addcust.setpassword("test123");
		
		addcust.setcustomersroles("Guest");
		

		addcust.setmanagervendor("Vendor 2");
		addcust.setGender("Male");
		addcust.setFirstName("Pavan");
		addcust.setLastName("Kumar");
		addcust.setdob("7/05/1985"); // Format: D/MM/YYY
		addcust.setcompanyname("busyQA");
		addcust.setadmincontent("This is for testing.........");
		Thread.sleep(3000);
	}
@When ("click on save button")

public void click_on_save_button() {
	addcust.clickonsave();
}

@Then("^User can view confirmation message \"([^\\\"]*)\"$" )
public void user_can_view_confirmation_message(String string) throws Throwable {
	Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
			.contains("The new customer has been added successfully"));
	Thread.sleep(3000);
}



@When("^Enter the email")
public void enter_the_email() throws Throwable {
   searchcust= new searchcustomer(driver);
   searchcust.setEmail("victoria_victoria@nopCommerce.com");
}

@When("^Click on search button")
public void click_on_search_button() throws InterruptedException {
	
	searchcust.Search();
	Thread.sleep(3000);
}

@Then("^user should found email in search table")
public void user_should_found_email_in_search_table() throws Throwable {
    
	boolean status=searchcust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
	Assert.assertEquals(true, status);
}




@When("^Enter the firstname")
public void enter_the_firstname() throws Throwable {
	
	searchcust= new searchcustomer(driver);
	searchcust.setFirstName("Victoria");
}

@When("^Enter the lastname")
public void enter_the_lastname() throws Throwable {
	
	searchcust.setLastName("Terces");
	
}



@Then("^user should found name in the search table")
public void user_should_found_name_in_the_search_table() throws Throwable {
   
	boolean status=searchcust.searchCustomerByName("Victoria Terces");
	Assert.assertEquals(true, status);
}
	
	





@When("^user click on customer menu")
public void user_click_on_customer_menu() {
	
	addrole= new customerroles(driver);
	addrole.clickoncustomers();
}

@When("^click on customer menu  item")
public void click_on_customerrole_menu_item() throws Throwable {
	
   addrole.clickonrole();
}


@When("^click on new  button role$")
public void click_on_add_new() throws Throwable {
   
	addrole.clickadd();
}

@Then("^user can view add  new customer role page$")
public void user_can_view_add_new_customer_role_page() throws Throwable {
	Assert.assertEquals("Add a new customer role / nopCommerce administration", addrole.getPageTitle());
}

@When("^user enter info$")
public void user_enter_info() throws Throwable {
    
	addrole.name("rajeesh");
}


@When("^click on product$")
public void click_on_product() throws Throwable {
    addrole.product();
}

@When("^click chooseproduct$")
public void click_chooseproduct() throws Throwable {
   addrole.productchoose();
   Thread.sleep(3000);
}



@Then("^enter the systetm name$")
public void enter_the_systetm_name() throws Throwable {
    addrole.system("apple");
}

@Then("^click on save$")
public void click_on_save() throws Throwable {
	addrole.save();
	Thread.sleep(5000);
}

 @Then("^user confirmation message \"([^\"]*)\"$")
public void user_confirmation_message(String arg1) throws Throwable {   
	Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
			.contains("The new customer role has been added successfully"));
Thread.sleep(3000);
}
}
	

