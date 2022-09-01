package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {
	public WebDriver driver;

	public loginpage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
By emaill= By.id("Email");
	
	
	public void setUserName(String uname) {
//		WebDriverWait txtEmaill = new WebDriverWait(driver,100); 
//		txtEmaill.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
		WebElement txtEmail =driver.findElement(emaill); 
		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}
	

	By password= By.id("Password");
	public void setPassword(String pwd) {
		WebElement txtPassword=driver.findElement(password);
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
 By login= By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");
 
 public void clicklogin() {
	 WebElement btnLogin=driver.findElement(login);
	 btnLogin.click();
 }
 
 
 
By logout= By.linkText("Logout");
 
 public void clicklogout() {
	 WebElement lnkLogout=driver.findElement(logout);
	 lnkLogout.click();
 }


	
	
	
}
