package testing.org;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class doubleclick {
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
    // double click 
    public void doublclick() throws InterruptedException {
   	WebElement  doubclick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
   	doubclick.click();
   	doubclick.click();
   	Thread.sleep(4000);
   	WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
   	System.out.println(box1.getText());
   	WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
   	System.out.println(box2.getText());
   	
    }
    @AfterMethod
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}
	

