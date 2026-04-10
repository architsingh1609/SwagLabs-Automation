package listners;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(listners.class)
public class listclss {
	WebDriver driver;
  @Test
  public void Openingwebpage() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

  }
  @Test
  public void login() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
  }
  //@Test
 // public void finglogo() {
	  //WebElement logo = driver.findElement(By.xpath("//img[@src='/public/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
	 // logo.click();
	  
	  
  //}
  @Test
  public void logout() throws InterruptedException {
	/*Select sc =   new Select (driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
	  //.selectByVisibleText("Logout"));
	sc.selectByVisibleText("Logout");
	*/
	  driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  
	  
  }
  @BeforeMethod 
  public void before() {
	  System.out.println("Before the class implemetation started");
  }
  @AfterMethod 
  public void after() {
	  System.out.println("After the class test completion test result popup");
	  
  }
}

