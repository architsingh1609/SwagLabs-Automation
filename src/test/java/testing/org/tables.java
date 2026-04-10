package testing.org;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tables {
	WebDriver driver;

    @BeforeMethod
    public void Beforetest() throws InterruptedException {
        System.out.println("Test Has been Initiated");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // MOST IMPORTANT LINE
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Websit launched ");
        Thread.sleep(5000);
    }
    @Test
    public void table() {
   	       WebElement table1 = driver.findElement(By.xpath("//div[@id='HTML1']"));
   	    	System.out.println(table1.getText());
   	    	
   	    	WebElement BookName = driver.findElement(By.xpath("//th[normalize-space()='BookName']"));
   	    	System.out.println(BookName.getText());
   	    
   	    	if(BookName.equals(BookName)) {
   	    		System.out.println("Book name is ....." + BookName);
   	    		
   	    		WebElement tittle = driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));
   	    		System.out.println(tittle.getText());
   	    		WebElement tagsize = driver.findElement(By.tagName("th"));
   	    		System.out.println(tagsize.getSize());
   	    		WebElement tagtd = driver.findElement(By.tagName("td"));
   	    		System.out.println(tagtd.getSize());
   	    		
   	    		WebElement Book = driver.findElement(By.xpath("//tbody/tr[7]/td[3]"));
   	    		System.out.println(Book.getText());
   	    		AssertJUnit.assertEquals("Javascript", "Javascript");
   	    		
   	    		boolean asser = driver.getPageSource().contains("Animesh");
   	    		AssertJUnit.assertTrue(asser);
   	    		}
   	    		
   	    		
   	    	}
    //dynamictable
   	    	@Test
   	    	public void dynamictable() {
   	    		WebElement tabletitl = driver.findElement(By.xpath("//h2[normalize-space()='Dynamic Web Table']"));
   	    		System.out.println(tabletitl.getText());
   	    		WebElement filltable = driver.findElement(By.xpath("//div[@id='HTML12']"));
   	    		System.out.println(filltable.getText());
   	    		AssertJUnit.assertEquals("0.15 MB/s", "0.15 MB/s");
   	    		boolean fefox = driver.getPageSource().contains("Firefox");
   	    		AssertJUnit.assertTrue(fefox);
   	    		WebElement cpu = driver.findElement(By.xpath("//div[@id='displayValues']"));
   	    		System.out.println(cpu.getText());
   	    		
   	    	
    }
   	    	//paginationtable
   	    	@Test
   	    	public void paginationtable() throws InterruptedException {
   	    		WebElement title = driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));
   	    		System.out.println(title.getText());
   	    		driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
   	    		Thread.sleep(2000);
   	    		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
   	    		Thread.sleep(2000);
   	    		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
   	    		driver.navigate().refresh();
   	    		driver.findElement(By.xpath("(//a[normalize-space()='4'])[1]")).click();
   	    		WebElement fulltab = driver.findElement(By.xpath("//div[@id='HTML8']"));
   	    		System.out.println(fulltab.getText());
   	    		
   	    		
   	    	}
   	     @AfterMethod
   	    public void Aftertest() {
   	        System.out.println("Test Has been Completed");
   	       driver.quit();
   	    }
   	}
	


