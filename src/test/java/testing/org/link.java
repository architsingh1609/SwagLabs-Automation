package testing.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class link {
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
	 public void link() {
		WebElement link = driver.findElement(By.xpath("(//a[normalize-space()='Apple'])[1]"));
		link.click();
		driver.navigate().back();
		
		WebElement link2 = driver.findElement(By.xpath("(//a[normalize-space()='Dell'])[1]"));
		link2.click();
		driver.navigate().back();
	 }
    @AfterMethod
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}


