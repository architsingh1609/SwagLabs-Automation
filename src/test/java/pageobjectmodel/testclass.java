package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	

	@Test
    public void Lofin() {
		usingpagefactor lp = new usingpagefactor(driver);
		lp.setusername("Admin");
		lp.setpassword("Admin123");
		lp.Btn();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}

	@AfterMethod
    public void teardown() {
		driver.quit();
		
	}

}
