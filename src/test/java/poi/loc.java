package poi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loc {
	
	WebDriver driver; 
	/// Const>>> Locator>>>> Action 

	// Const
	loc(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Locator
	

     By user_name =  By.xpath("//input[@placeholder='Username']");
     By user_password =  By.xpath("//input[@placeholder='Password']");
     By btn =  By.xpath("//button[normalize-space()='Login']");
     
     // Action 
     
     public void setup(String user) {
    	 driver.findElement(user_name).sendKeys(user);
     }
     
     public void password(String pw) {
    	 driver.findElement(user_password).sendKeys(pw);
     }
     
     public void Button() {
    	 driver.findElement(btn).click();
     }
	
	
	
}
