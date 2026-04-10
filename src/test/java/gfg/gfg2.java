package gfg;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class gfg2 {

    WebDriver driver;

    @BeforeMethod
    public void beforeall() {
    	System.out.println("Test has been inisiated");
    }
    @Test(dataProvider = "getdata")
    public void orangehrm(String Username, String password) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        user.sendKeys(Username);

        Thread.sleep(2000);

        WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        pass.sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

       // driver.quit();
    }
    
    @AfterMethod
    public void Afterall() {
    	System.out.println("Test has been inisiated");
    	  driver.quit();
    }
    

    @DataProvider(name = "getdata")
    public Object[][] getdata() {
        return new Object[][] {
            {"Admi", "Admin1"},
            {"Admin", "Admi23"},
            {"Admin", "Admi23"},
            {"Admin", "Admin123"}
        };
    }
}