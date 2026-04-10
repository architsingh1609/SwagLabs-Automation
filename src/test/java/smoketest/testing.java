package smoketest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing {
	
	WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Before the test");
    }

    @Test
    public void fillFormTest() {

        // Text fields
        driver.findElement(By.id("name")).sendKeys("Archit Singh");
        driver.findElement(By.id("email")).sendKeys("archit@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("9191919134");
        driver.findElement(By.id("textarea")).sendKeys("Gurugram");

        // Gender
        driver.findElement(By.id("male")).click();

        // Days (FIXED XPATH)
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='sunday']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='saturday']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='wednesday']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='thursday']")).click();

        // Country dropdown
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("France");

        // Colors
        driver.findElement(By.xpath("//option[@value='green']")).click();

        // Animals
        driver.findElement(By.xpath("//option[@value='cheetah']")).click();

        // Date picker
        driver.findElement(By.id("datepicker")).sendKeys("01/15/2007");
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
        System.out.println("After the test");
    }
}

