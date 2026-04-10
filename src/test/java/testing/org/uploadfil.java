package testing.org;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class uploadfil {
	

	WebDriver driver;

    @BeforeMethod
    public void Beforetest() throws InterruptedException {
        System.out.println("Test Has been Initiated");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // MOST IMPORTANT LINE
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Websit launched ");
        Thread.sleep(5000);
    }
    
    @Test

    public void uploadfile2() throws InterruptedException {
    	//This Element is inside single shadow DOM.
    	String cssSelectorForHost1 = "#shadow_host";
    	Thread.sleep(1000);
    	SearchContext shadow = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
    	Thread.sleep(1000);
    	 WebElement send =  shadow.findElement(By.cssSelector("input[type='file']"));
    	 
    	 send.sendKeys("/Users/architsingh/Downloads/info.txt");
    	 
    	 
    }    	
    @AfterMethod
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}


