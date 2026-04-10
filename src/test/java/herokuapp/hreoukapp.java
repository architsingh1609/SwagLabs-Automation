package herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hreoukapp {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void website() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void abtesting() throws InterruptedException {
		WebElement abtesting = driver.findElement(By.xpath("//a[normalize-space()='A/B Testing']"));
		abtesting.click();
		Thread.sleep(3000);
		WebElement page = driver.findElement(By.cssSelector("div[class='example'] h3"));
		System.out.println(page.getText());
		System.out.println(driver.getTitle());
		WebElement also = driver.findElement(By.xpath("//p[contains(text(),'Also known as split testing. This is a way in whic')]"));
		System.out.println(also.getText());
	}
	
	public void addremove() throws InterruptedException {
		WebElement add = driver.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']"));
		add.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='content'] h3"));
		WebElement addelement  = driver.findElement(By.xpath("//button[normalize-space()='Add Element']"));
	}

	@AfterMethod
	public void sutdown(){
		System.out.println("Now completed");
		driver.quit();
	}
{
}

} 
	

