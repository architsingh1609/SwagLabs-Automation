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

public class alerts {
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
 // Alertes 
    @Test
    public void alert() {
    WebElement Simpalert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
    Simpalert.click();
    driver.switchTo().alert().accept();
    
    WebElement comfalert = driver.findElement(By.xpath("(//button[normalize-space()='Confirmation Alert'])[1]"));
    comfalert.click();
    driver.switchTo().alert().accept();
    
    WebElement promalert = driver.findElement(By.xpath("(//button[normalize-space()='Prompt Alert'])[1]"));
    promalert.click();
    driver.switchTo().alert().sendKeys("Harry Potter");
    driver.switchTo().alert().accept();
    }
    @AfterMethod
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}
	


