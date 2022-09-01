package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addcustomer {

	

	public WebDriver driver;
	
	public addcustomer(WebDriver rdriver) {
		driver= rdriver;
		PageFactory.initElements(driver,this);
	}

	
	By customersmenu= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a");
	By customersmenuitem= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p");
	By addnew=By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");
	
	By customerroles= By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"); 
	By lstitemAdministrators=By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");
	
	
	By drpmgrOfVendor=By.xpath("//*[@id='VendorId']");
	By rdMaleGender=By.id("Gender_Male");
	By rdFeMaleGender=By.id("Gender_Female");
	
	By txtFirstName=By.xpath("//input[@id='FirstName']");
	By txtLastName=By.xpath("//input[@id='LastName']");
	
	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	
	By txtCompanyName=By.xpath("//input[@id='Company']");
		
	By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");
	
	By btnSave=By.xpath("//button[@name='save']");
	
	
	public String getPageTitle()
	{
		return  driver.getTitle();
	}
	
	
	public void clickoncustomermenu() {
		
		driver.findElement(customersmenu).click();
	}
	
	public void clickoncustomermenuitem() {
		driver.findElement(customersmenuitem).click();
	}
	
	public void clickonaddnew() {
		driver.findElement(addnew).click();;
		
	}
	
	public void setemail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setpassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void setcustomersroles(String role) throws Throwable {
		
		if(!role.equals("Vendors")) {
			driver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
		}
		driver.findElement(customerroles);
		WebElement listitem;
		Thread.sleep(3000);
		
		if(role.equals("Administrators")) {
			listitem=driver.findElement(lstitemAdministrators);
		}
		
		else if(role.equals("Guests")) {
			listitem=driver.findElement(lstitemGuests);
			
		}

		else if(role.equals("Registered")) {
			listitem=driver.findElement(lstitemRegistered);
			
		}
		
		else if(role.equals("Vendors")) {
			listitem=driver.findElement(lstitemVendors);
			
		}
		else
		{
			listitem=driver.findElement(lstitemGuests);
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", listitem);
	}
	
	public void setmanagervendor(String value) {
		
		Select drp=new Select(driver.findElement(drpmgrOfVendor));
		drp.selectByVisibleText(value);
	}
	
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			driver.findElement(rdFeMaleGender).click();;
		}
		else if(gender.equals("Female")) {
			driver.findElement(rdFeMaleGender).click();
		}
		else {
			driver.findElement(rdFeMaleGender).click();
		}
		
		
	}
	
	public void setFirstName(String fname) {
		
		driver.findElement(txtFirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		
		driver.findElement(txtLastName).sendKeys(lname);
	}
	
    public void setdob(String dob) {
		
		driver.findElement(txtDob).sendKeys(dob);
	}
	
    public void setcompanyname(String comname) {
	
	driver.findElement(txtCompanyName).sendKeys(comname);
}

   public void setadmincontent(String content) {
		
		driver .findElement(txtAdminContent).sendKeys(content);
	}
   
   public void clickonsave() {
	   driver.findElement(btnSave).click();
   }

   }

