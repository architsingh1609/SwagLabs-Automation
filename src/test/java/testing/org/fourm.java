package testing.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fourm {
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
        // fourm
        public void fourm() {
        driver.findElement(By.xpath("(//input[@id='input1'])[1]")).sendKeys("Archit");
        driver.findElement(By.xpath("//button[@id='btn1']")).click();
        driver.findElement(By.xpath("//input[@id='input2']")).sendKeys("Archit");
        driver.findElement(By.xpath("(//button[@id='btn2'])[1]")).click();
        driver.findElement(By.xpath("(//input[@id='input3'])[1]")).sendKeys("Archit");
        driver.findElement(By.xpath("(//button[@id='btn3'])[1]")).click();
        }
	}
	

