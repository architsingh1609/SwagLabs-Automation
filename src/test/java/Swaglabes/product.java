package Swaglabes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class product {

	
	WebDriver driver;
	@BeforeTest
	public void site() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		
	}
	@Test (priority  = 1)
	public void producttocart() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		
		
	}
	@Test (priority  = 2)
	public void filter() throws InterruptedException {
		 new Select (driver.findElement(By.xpath("//select[@class='product_sort_container']"))).selectByVisibleText("Price (low to high)");
		 driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		 
		 
		 
	}
	@Test (priority  = 3)
	public void cart() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		//driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		
	}
	@Test (priority  = 4)
	public void checkout() {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("singh");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("singhh");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("122018");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		
	
	}
	
	}
	
