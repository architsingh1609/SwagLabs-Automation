package datdriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider = "dsp")
	void test(String name, String passworrd) throws InterruptedException {
		System.out.println("Title of the page is " + driver.getTitle());

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(name);
		System.out.println("Title of the page is " + driver.getTitle());
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(passworrd);
		
		System.out.println("Title of the page is " + driver.getTitle());
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	   	Thread.sleep(5000);
		
		System.out.println("page is logged in and i am currently in side the ppage ");
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']"));
		title.getText();
		
		WebElement logout =  driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
		logout.click();
		
		
		
	}
	@AfterClass
	void logout() {
		driver.close();
		
	}
	@DataProvider(name = "dsp")
	String[][] logindata(){
		String data[][] = {
				/*{"archit@gmail.com","singh123"},
				{"archi@gmail.com","sigh123"},
				{"arch@gmail.com","sinh123"},*/
				{"student","Password123"},
};
		return data;
	}

}
