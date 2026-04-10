package fulltest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prac {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
    }
/*
    @Test
    public void slider() throws InterruptedException {
        Thread.sleep(2000);

        Actions act = new Actions(driver);
        WebElement slid1 = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));

        act.dragAndDropBy(slid1, 80, 0).perform();
    }

    @Test
    public void slider1() throws InterruptedException {
        Thread.sleep(2000);

        Actions act = new Actions(driver);
        WebElement slid1 = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
        WebElement slid2 = driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));

        act.dragAndDropBy(slid1, 80, 0).perform();
        act.dragAndDropBy(slid2, -90, 0).perform();
    }

    @Test
    public void dragdrop() throws InterruptedException {
        Thread.sleep(3000);

        Actions act = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

        act.dragAndDrop(drag, drop).perform();
    }
    */
//    @Test
//    public void table() {
//   	 
//    	WebElement table = driver.findElement(By.xpath("//div[@id='HTML1']"));
//    	System.out.println(table.getText());
//    	
//    	WebElement BookName = driver.findElement(By.xpath("//th[normalize-space()='BookName']"));
//    	System.out.println(BookName.getText());
//    
//    	if(BookName.equals(BookName)) {
//    		System.out.println("Book name is ....." + BookName);
//    		
//    		WebElement tittle = driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));
//    		System.out.println(tittle.getText());
//    		WebElement tagsize = driver.findElement(By.tagName("th"));
//    		System.out.println(tagsize.getSize());
//    		WebElement tagtd = driver.findElement(By.tagName("td"));
//    		System.out.println(tagtd.getSize());
//    		
//    		WebElement Book = driver.findElement(By.xpath("//tbody/tr[7]/td[3]"));
//    		System.out.println(Book.getText());
//    		Assert.assertEquals("Javascript", "Javascript");
//    		
//    		boolean asser = driver.getPageSource().contains("Animesh");
//    		Assert.assertTrue(asser);
//    		
//    		
//    	}
//     }
//    @Test
//    public void dynamictable() {
//		WebElement tabletitl = driver.findElement(By.xpath("//h2[normalize-space()='Dynamic Web Table']"));
//		System.out.println(tabletitl.getText());
//		WebElement filltable = driver.findElement(By.xpath("//div[@id='HTML12']"));
//		System.out.println(filltable.getText());
//		Assert.assertEquals("0.15 MB/s", "0.15 MB/s");
//		boolean fefox = driver.getPageSource().contains("Firefox");
//		Assert.assertTrue(fefox);
//		WebElement cpu = driver.findElement(By.xpath("//div[@id='displayValues']"));
//		System.out.println(cpu.getText());
//		//WebElement contins = driver.findElement(By.linkText("CPU load of Chrome process: 0.3%"));
//		
//		
//	
//    @Test
//    public void Scrolling() throws InterruptedException {
//    	driver.findElement(By.xpath("//input[@id='comboBox']")).click();
//    	Thread.sleep(3000);
//    	driver.findElement(By.xpath("//div[normalize-space()='Item 3']")).click();
//    	driver.navigate().refresh();
//    	//driver.findElement(By.xpath("//div[normalize-space()='Item 1']")).click();
//    	//driver.navigate().refresh();
//    
//    	WebElement option = driver.findElement(By.xpath("//input[@id='comboBox']"));
//    	Actions act = new Actions(driver);
//    	act.moveToElement(option).click().perform();
//    	driver.findElement(By.xpath("//div[normalize-space()='Item 54']")).click();
//    	
//    	
//    }
//   
    @Test

    public void uploadfile2() throws InterruptedException {
    	//This Element is inside single shadow DOM.
    	String cssSelectorForHost1 = "#shadow_host";
    	Thread.sleep(1000);
    	SearchContext shadow = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
    	Thread.sleep(1000);
    	 WebElement send =  shadow.findElement(By.cssSelector("input[type='file']"));
    	 
    	 send.sendKeys("/Users/architsingh/Downloads/info.txt");
    	 
    	 
    }
    @AfterMethod
    public void teardown() {
      // driver.quit();
    }
}
