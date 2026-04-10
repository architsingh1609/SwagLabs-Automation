package Swaglabes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

    WebDriver driver;

    @BeforeMethod
    public void Opening() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void username() {

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));

        String user1 = "standard_user";
        String user2 = "locked_out_user";
        String user3 = "problem_user";
        String user4 = "performance_glitch_user";
        String user5 = "error_user";
        String user6 = "visual_user";

        username.sendKeys(user1);
        // Change the user name with different users and same should be in the test cas 4 
    }

    @Test(priority = 2)
    public void password() {

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        String pass = "secret_sauce";
        password.sendKeys(pass);
    }
    @Test (priority = 3)
    public void Button() {
    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @Test(priority = 4)
    public void fullacces() {
    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys( "secret_sauce");
    	driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }
    @AfterTest
    public void close() {
    	driver.quit();
    }
}