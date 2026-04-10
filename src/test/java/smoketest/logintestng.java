package smoketest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logintestng {
	
	@Test
	public void logintest() {
		System.out.println("Test is running now");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).isDisplayed();
		driver.findElement(By.id("email")).isDisplayed();
		List<WebElement> listelements = driver.findElements(By.tagName("a"));
		System.out.println("List of a tags in the url "+ listelements );
		
	}
	@BeforeMethod
	public void setup() {
		System.out.println("Before test is starting");
	}
	@AfterMethod
	public void teardown() {
		System.out.println("test run sucessfully");
	}

}
