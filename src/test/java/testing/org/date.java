package testing.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class date {
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
    
    WebElement startdate = driver.findElement(By.id("start-date"));
    startdate.sendKeys("12/12/2001");

    WebElement enddate = driver.findElement(By.id("end-date"));
    enddate.sendKeys("12/12/2001");
    System.out.println("Websit launched ");
    Thread.sleep(5000);
    // close date picker
    driver.findElement(By.tagName("body")).click();

    // wait & click
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement submitBtn = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='submit-btn']"))
    );
    submitBtn.click();
    System.out.println("Websit launched ");
    Thread.sleep(5000);

}
}
