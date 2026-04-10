package Swaglabes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintestsenario {
	WebDriver driver;
	@BeforeTest
	public void loadsite() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
	}@Test ()
	public void validdetails() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}@Test
	public void invalid2() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebElement error1 = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		System.out.println(error1.getText());
	}@Test
	public void invalid3() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebElement error2 = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		System.out.println(error2.getText());
	}@Test
	public void invalid4() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebElement error3 = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		System.out.println(error3.getText());
	}@Test
	public void invalid5() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("error_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebElement error4 = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		System.out.println(error4.getText());
	}@Test
	public void invalid6() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("visual_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebElement error5 = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		System.out.println(error5.getText());
	}@Test
		public void invalidpass1() {
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("visual_user");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			WebElement invalidpass1 = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
			System.out.println(invalidpass1.getText());
		}
		
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
