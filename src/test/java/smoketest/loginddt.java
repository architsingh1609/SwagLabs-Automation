package smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginddt {
	
	@Test(dataProvider = "getData")
	public void logintest(String Name, String Email, String Phone, String Address){
		//System.out.println("New Record: "+ Name + " "+ Email + " "+ Phone + " "+ Address);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Test is Running");
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.id("name")).sendKeys(Name);
	driver.findElement(By.id("email")).sendKeys(Email);
	driver.findElement(By.id("phone")).sendKeys(Phone);
	driver.findElement(By.id("textarea")).sendKeys(Address);
	driver.quit();
	}
	@BeforeMethod 
	public void Setup() {
		System.out.println("Test has been inisiated");
	}
	@AfterMethod
	public void SetDown() {
		System.out.println("Test has succesfullt tested ");
		
	}
	@DataProvider
	public String[][] getData(){
		return utilities.Excel.getData("/Users/architsingh/Userloginpage..xlsx");
		
	}

}
