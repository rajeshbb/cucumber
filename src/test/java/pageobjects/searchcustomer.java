 package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchcustomer {

	
	public  WebDriver driver;
	
	public searchcustomer(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	By txtEmail=By.id("SearchEmail");
	By txtFirstName=By.id("SearchFirstName");
	By txtLastName=By.id("SearchLastName");
	@FindBy(how = How.XPATH, using = "//table[@role='grid']")
	@CacheLookup
	WebElement tblSearchResults;
	

//	@FindBy(how = How.ID, using ="search-customers")
//	@CacheLookup
//	WebElement btnSearch;
	
	
	
	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
	WebElement table;

	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;

	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tableColumns;
	
	
	public void setEmail(String email) {
		WebElement emailelement=driver.findElement(txtEmail);
		emailelement.clear();
		emailelement.sendKeys(email);
	}
	public  void setFirstName(String fname) {
		WebElement name= driver.findElement(txtFirstName);
		name.clear();
		name.sendKeys(fname);
	}
	
	public  void setLastName(String lname) {
		WebElement lastname= driver.findElement(txtLastName);
		lastname.clear();
		lastname.sendKeys(lname);
	}
	
	public  void Search(){
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-customers")));
		
		 WebElement search=driver.findElement(By.id("search-customers"));
		 search.click();
		
//		btnSearch.click();
		
	}
	
	public int getNoOfRows() {
		
		return (tableRows.size());
	}

	public int getNoOfColumns() {
		
		return (tableColumns.size());
	}

	public boolean searchCustomerByEmail(String email) {
		boolean flag = false;
     
		for (int i = 1; i <= getNoOfRows(); i++) {
			String emailid = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[2]"))
					.getText();

					
			
			System.out.println(emailid);

			if (emailid.equals(email)) {
				flag = true;
				break;
			}
		}

		return flag;

	}

	public boolean searchCustomerByName(String Name) {
		
		boolean flag = false;

		for (int i = 1; i <= getNoOfRows(); i++) {
			String name = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[3]"))
					.getText();

			
			if (Name.equals(name)) {
				flag = true;
				break;
			}
		}

		return flag;

	}

}
	

