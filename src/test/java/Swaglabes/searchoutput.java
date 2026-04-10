package Swaglabes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class searchoutput {
	public class logintestsenario {
		WebDriver driver;
		@BeforeTest
		public void loadsite() {
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			
			
		}@Test (priority = 1)
		public void validdetails() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(4000);
			
		}@Test   (priority = 2)
		// Search  >>> filter>>> add to cart>>  paymeent>>> pox xml file create krna hai
		public void filter() {
			new Select (driver.findElement(By.xpath("//select[@class='product_sort_container']"))).selectByVisibleText("Price (high to low)");
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
			driver.navigate().refresh();
			new Select (driver.findElement(By.xpath("//select[@class='product_sort_container']"))).selectByVisibleText("Price (low to high)");
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
	
		} @Test (priority = 3)
		public void removeproduct() throws InterruptedException {
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@alt='Sauce Labs Bolt T-Shirt']")).click();
			Thread.sleep(4000);
			WebElement price = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
			System.out.println(price.getText()+ "Price is to high");
			driver.findElement(By.xpath("//button[@id='remove']")).click();
			
			
			
			
			
		}@AfterTest
		public void quit() {
			driver.quit();
		}
		
		
		
	}
	
}
