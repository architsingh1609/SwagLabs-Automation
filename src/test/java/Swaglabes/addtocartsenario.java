package Swaglabes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class addtocartsenario {
	
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
		}@Test (priority = 3)
		public void addtocartedting() {
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			driver.findElement(By.xpath("//button[@id='checkout']")).click();
			
		}@Test (priority = 4)
		public void checkout() {
			driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Singh");
			driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("is king");
			driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12217288");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
		}@Test (priority = 5)
		public void total() {
			WebElement total = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
			System.out.println("Total price is = " +total.getText());
		}@Test (priority = 6)
		public void finalpayment() {
			driver.findElement(By.xpath("//button[@id='finish']")).click();
			
		}@AfterTest
		public void quit() {
			driver.quit();
			
		}
		// Usser is getting Logged out 

}
}

