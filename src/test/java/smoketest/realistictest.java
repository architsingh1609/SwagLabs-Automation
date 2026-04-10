package smoketest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class realistictest {
	
	@Test
	public void website() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[@aria-label='Enter From station. Input is Mandatory.']")).sendKeys("GORAKHPUR JN - GKP (GORAKHPUR)");
		driver.findElement(By.xpath("//input[@aria-label='Enter To station. Input is Mandatory.']")).sendKeys("NEW DELHI - NDLS (NEW DELHI)");
		driver.findElement(By.xpath("(//input[@class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]")).sendKeys("19/01/2026");
		new Select(driver.findElement(By.xpath("(//div[@class='ng-tns-c76-10 ui-dropdown ui-widget ui-state-default ui-corner-all'])[1]"))).selectByVisibleText("\n"
				+ "AC First Class (1A)");
		//AC First Class (1A)
		new Select(driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c76-11 pi pi-chevron-down'])[1]"))).selectByVisibleText("LADIES");
		
		//LADIES
		// Comand to switch Window 
		//ArrayList<String> Window = new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(Window.get(1));
		
		//(//span[@class='ui-button-text ui-clickable'])[1]
		// to get confermation of the page, if or condition when window is switched
	// 	String pagetitle = driver.getTitle();
		//Assert.assertTrue(pagetitle.contains("getTitle"));
	}
	@BeforeMethod
	public void beforesetup() {
		System.out.println("Inisiating the website");
		
	}
	@AfterMethod
	public void aftersetup() {
		//WebDriver driver = new ChromeDriver();
		System.out.println("Done With the process");
		//driver.close();
	}

}

