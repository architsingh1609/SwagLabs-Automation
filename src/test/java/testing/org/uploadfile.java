package testing.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class uploadfile {
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
    @Test
    public void uploadfile() throws InterruptedException {
    WebElement singlefile = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
    singlefile.sendKeys("/Users/architsingh/Downloads/Book1.xlsx");
    driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
    WebElement status = driver.findElement(By.xpath("//p[@id='singleFileStatus']"));
    status.getText();
    WebElement multipefile = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
    multipefile.sendKeys("/Users/architsingh/Downloads/Book1.xlsx");
    multipefile.sendKeys("/Users/architsingh/Downloads/poi-5.5.0.jar");
    driver.findElement(By.xpath("//button[normalize-space()='Upload Multiple Files']")).click();
    WebElement result2 = driver.findElement(By.xpath("//p[@id='multipleFilesStatus']"));
    result2.getText();
    driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
    driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/input[1]"));
    System.out.println("Websit launched ");
    Thread.sleep(5000);
    }


 

}
