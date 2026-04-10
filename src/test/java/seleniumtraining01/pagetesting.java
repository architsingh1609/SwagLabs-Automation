package seleniumtraining01;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pagetesing.dashboard;
import pagetesing.pagetestingvalues;

public class pagetesting {
	
	@Test
	public void pagetesting(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//1 . Get Page
		driver.get("https://testautomationpractice.blogspot.com/");
	//2. Pagelogin
		// here i have imported the other package file named as pagetestingvalues
		pagetestingvalues Pagetestingvalues = new pagetestingvalues(driver);
		Pagetestingvalues.namevalues("Archit singh");
		Pagetestingvalues.phonenumber("9140480213");
		Pagetestingvalues.emailvalues("architsingh1609@gmail.com");
		Pagetestingvalues.address("mohaddpur avantika hotel");
  // 3. Get Confirmation(database page)
		dashboard Dashboard  = new dashboard(driver);
		Dashboard.confirmation();
		//System.out.println("confirmation" + confirmation);

		//String conf = Dashboard.confirmation();
		//Assert.assertTrue(conf.contains("Gender"));
		
		
		
		
   // 4. close the page 
		driver.quit();
		
		
		
		
	}
	

}
