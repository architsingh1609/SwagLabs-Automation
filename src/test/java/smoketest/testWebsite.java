package smoketest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testWebsite {
	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().minimize();
		// >> Locaters 
		driver.findElement(By.id("name")).sendKeys("");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("phone")).sendKeys("");
		driver.findElement(By.id("textarea")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		//if (driver.findElement(By.xpath("//label[normalize-space()='Male']")).equals("Male"))
			//System.out.println("Value is satisfied");
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		//WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		//Select country = new Select(driver.findElement(By.id("country"))); country.selectByVisibleText("Canada");
		Select Country = new Select(driver.findElement(By.id("Country")));
		Country.selectByVisibleText("Canada");
		driver.findElement(By.xpath("//option[@value='blue']")).click();
		driver.findElement(By.xpath("//option[@value='zebra']")).click();
		
	}
	@BeforeAll
	public void testbefore() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Web testing has been inisiated");
		
	}
	public void setup() {
		System.out.println("Values afterr the test runned ");
		
		
	}

}














