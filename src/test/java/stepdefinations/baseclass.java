package stepdefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageobjects.addcustomer;
import pageobjects.customerroles;
import pageobjects.loginpage;
import pageobjects.searchcustomer;

public class baseclass {

	public WebDriver driver;
	public loginpage lp;
	public addcustomer addcust;
	
	public searchcustomer searchcust;
	
	public customerroles addrole;
	
	public static String randomstring() {
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
}
