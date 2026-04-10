package Swaglabes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class addtocart {
	WebDriver driver;
	@BeforeTest
	public void login() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys( "secret_sauce");
    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
    	
    	
		
		
	}@Test
	
	public void addtocart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		
	}

}
