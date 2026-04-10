package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class usingpagefactor {

	WebDriver driver;
	
	// Constructor
	
	usingpagefactor(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Locator
	

       By username =  By.xpath("//input[@placeholder='Username']");
       By pass =   By.xpath("//input[@placeholder='Password']");
       By btn =  By.xpath("//button[normalize-space()='Login']");
	
	
	// Action
	
       public void setusername(String user)
       {
    	   driver.findElement(username).sendKeys(user);
       }
       
       public void setpassword(String pw)
       {
    	   driver.findElement(pass).sendKeys(pw);
       }
       
       public void Btn()
       {
    	   driver.findElement(btn).click();
       }
}

