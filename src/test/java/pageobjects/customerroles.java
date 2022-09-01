package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customerroles {

	
	
	public WebDriver driver;
	
	public customerroles(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	
	
	public String getPageTitle()
	{
		return  driver.getTitle();
	}
	
   public void clickoncustomers() {
	   WebElement customerss=driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a"));
	   
	   customerss.click();
   }
   
   public void clickonrole() {

	   WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[2]/a/p")));
		
		 WebElement role=driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[2]/a/p"));
		 role.click();
   }
   
   public void clickadd() {
	   WebElement addnew= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a"));
	   addnew.click();
   }
   
   public void name(String fname) {
	   WebElement nameelement= driver.findElement(By.id("Name"));
	   nameelement.sendKeys(fname);
   }
   
   public void active() {
	   WebElement activeelement= driver.findElement(By.xpath("//*[@id='Active']"));
	   
	   activeelement.click();
   }
   public void product() throws Throwable {
	   WebElement productelemnt=driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/div/div/div/div[8]/div[2]/button[1]"));
	   productelemnt.click();
	   
	   Thread.sleep(3000);
   }
   
   public void productchoose() {
	   
	  
		 List<WebElement>  productelement = driver.findElements(By.xpath("//*[@id='products-grid']/tbody/tr[1]/td[1]/button"));

	        for(WebElement button : productelement) {
	         if(button.isDisplayed()) {
	             button.click();
	          }
	        }
	   
	        
   }
   
  
   public void system(String sname) {
	   WebElement ssystem=driver.findElement(By.id("SystemName"));
	   ssystem.sendKeys(sname);
   }
   
   public void save() {
	   WebElement saveelement= driver.findElement(By.name("save"));
	   saveelement.click();
	   
	   
   }
}
