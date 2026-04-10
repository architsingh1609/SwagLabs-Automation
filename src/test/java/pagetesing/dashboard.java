package pagetesing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboard {
	WebDriver driver;
	 public dashboard(WebDriver driver) {
	        this.driver = driver;
	        
	    }
	 public void confirmation() {
		 driver.findElement(By.xpath("(//label[normalize-space()='Gender:'])[1]")).getText();
	 }
	

}
