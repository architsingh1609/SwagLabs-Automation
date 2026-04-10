package testing.org;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class main {

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
    public void test() throws InterruptedException {

        driver.findElement(By.id("name")).sendKeys("archit");
        driver.findElement(By.id("email")).sendKeys("1234@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("999191919");
        driver.findElement(By.id("textarea")).sendKeys("gorakhpur");

        driver.findElement(By.id("male")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.id("sunday")).click();
        driver.findElement(By.xpath("//option[@value='blue']")).click();

        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByVisibleText("Dog");

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("Japan");

        driver.findElement(By.id("datepicker")).sendKeys("02/03/2026");
        driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("/Users/architsingh/eclipse-workspace/seleniumtraining1/features/Login.features");
        System.out.println("Websit launched ");
        Thread.sleep(5000);
}
    @AfterMethod
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}


