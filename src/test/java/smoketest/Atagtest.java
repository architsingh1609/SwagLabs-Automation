package smoketest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Atagtest {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  System.out.println("Running the test case");
	  driver.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> tages = driver.findElements(By.tagName("a"));
	  System.out.println("List of the elementes are " + tages);  
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
