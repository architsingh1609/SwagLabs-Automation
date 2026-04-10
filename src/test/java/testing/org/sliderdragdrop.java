package testing.org;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sliderdragdrop {
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
    public void slider() throws InterruptedException {
   	 Thread.sleep(2000);
   	 Actions act = new Actions(driver);
   	WebElement slid1 = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
       WebElement slid2 = driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));
   	act.dragAndDropBy(slid1, 80, 0).click().perform();
   	act.dragAndDropBy(slid2, -90, 0).click().perform();
   	
   	
    }
    // drag and drop 
    
    public void dragdrop() throws InterruptedException {
   	 Thread.sleep(3000);
   	 Actions act = new Actions(driver);
   	WebElement drag = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
   	WebElement drop =  driver.findElement(By.xpath("//div[@id='droppable']"));
   	act.dragAndDrop(drag, drop).perform();
    }

    @AfterMethod
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}


