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

public class downloads {
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
    public void download() throws InterruptedException {
    	driver.findElement(By.xpath("//a[normalize-space()='Download Files']")).click();
    	Thread.sleep(5000);
    	
    	WebElement text = driver.findElement(By.xpath("//textarea[@id='inputText']"));
    	text.sendKeys("singh ");
    	driver.findElement(By.xpath("//button[@id='generateTxt']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[@id='txtDownloadLink']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[@id='generatePdf']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[@id='pdfDownloadLink']")).click();
    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//button[normalize-space()='Download PDF File']")).click();
    	driver.navigate().back();
    	
    	driver.findElement(By.xpath("(//a[@class='home-link'])[1]")).click();
    	
    	
    	
    	driver.navigate().refresh();
    	
    } @AfterMethod
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}




