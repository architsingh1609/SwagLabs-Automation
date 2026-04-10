package smoketest;

import java.sql.Driver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testpageinput {
	@Test
	public void inputs() {
		WebDriver driver = new ChromeDriver();
		//String name  = driver.findElement(By.id("name"));
		//String email = driver.findElement(By.id("email"));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Archit singh");
		driver.findElement(By.id("email")).sendKeys("architsingh1609@gmail.com");
		
		
		
	}
	@BeforeAll
	public void inputbefore() {
		System.out.println("Test has been inisiated");
		
	}
	@AfterAll
	public void inputafter() {
		System.out.println("Testing Completed succesfully not to get the input values as an outpur or not");
		
	}
	
	
}
