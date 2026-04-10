package poi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass {
	
	// before >> test(call constructor) >>> after 
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Test iniseate ");
	}
	
	@Test
	public void testannotation() {
		loc lp = new loc(driver);
		lp.setup("Admin");
		lp.password("Admin123");
		lp.Button();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
		System.out.println("Test completed");
		}
	
	@AfterMethod
    public void Teardown() {
		System.out.println("Test is completed Now Quiting");
		driver.quit();
		
	}
	
	

}
