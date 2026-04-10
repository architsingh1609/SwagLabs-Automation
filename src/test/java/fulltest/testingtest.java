package fulltest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testingtest {

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
    public void test() throws InterruptedException {

        driver.findElement(By.id("name")).sendKeys("archit");
        driver.findElement(By.id("email")).sendKeys("1234@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("999191919");
        driver.findElement(By.id("textarea")).sendKeys("gorakhpur");

        driver.findElement(By.id("male")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.id("sunday")).click();
        driver.findElement(By.xpath("//option[@value='blue']")).click();

        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByVisibleText("Dog");

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("Japan");

        driver.findElement(By.id("datepicker")).sendKeys("02/03/2026");
        driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("/Users/architsingh/eclipse-workspace/seleniumtraining1/features/Login.features");
        System.out.println("Websit launched ");
        Thread.sleep(5000);
        // date
        
        WebElement startdate = driver.findElement(By.id("start-date"));
        startdate.sendKeys("12/12/2001");

        WebElement enddate = driver.findElement(By.id("end-date"));
        enddate.sendKeys("12/12/2001");
        System.out.println("Websit launched ");
        Thread.sleep(5000);

        // close date picker
        driver.findElement(By.tagName("body")).click();

        // wait & click
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='submit-btn']"))
        );
        submitBtn.click();
        System.out.println("Websit launched ");
        Thread.sleep(5000);
    }

    
       
      // Upload Files
      @Test
      public void uploadfile() throws InterruptedException {
      WebElement singlefile = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
      singlefile.sendKeys("/Users/architsingh/Downloads/Book1.xlsx");
      driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
      WebElement status = driver.findElement(By.xpath("//p[@id='singleFileStatus']"));
      status.getText();
      WebElement multipefile = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
      multipefile.sendKeys("/Users/architsingh/Downloads/Book1.xlsx");
      multipefile.sendKeys("/Users/architsingh/Downloads/poi-5.5.0.jar");
      driver.findElement(By.xpath("//button[normalize-space()='Upload Multiple Files']")).click();
      WebElement result2 = driver.findElement(By.xpath("//p[@id='multipleFilesStatus']"));
      result2.getText();
      driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
      driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/input[1]"));
      System.out.println("Websit launched ");
      Thread.sleep(5000);
      }
      @Test
      // fourm
      public void fourm() {
      driver.findElement(By.xpath("(//input[@id='input1'])[1]")).sendKeys("Archit");
      driver.findElement(By.xpath("//button[@id='btn1']")).click();
      driver.findElement(By.xpath("//input[@id='input2']")).sendKeys("Archit");
      driver.findElement(By.xpath("(//button[@id='btn2'])[1]")).click();
      driver.findElement(By.xpath("(//input[@id='input3'])[1]")).sendKeys("Archit");
      driver.findElement(By.xpath("(//button[@id='btn3'])[1]")).click();
      }
      
      // Wikipedia
      @Test
      public void wikipedia() {
      driver.findElement(By.xpath("(//input[@id='Wikipedia1_wikipedia-search-input'])[1]")).sendKeys("mahatma gandhi");
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      }
      //Dynamic Button
      @Test
      public void dynamicbutton() throws InterruptedException {
     WebElement Button = driver.findElement(By.xpath("(//button[normalize-space()='START'])[1]"));
     Button.click();
     Thread.sleep(1000);
     Button.click();
      }
     
     
     // Alertes 
     @Test
     public void alert() {
     WebElement Simpalert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
     Simpalert.click();
     driver.switchTo().alert().accept();
     
     WebElement comfalert = driver.findElement(By.xpath("(//button[normalize-space()='Confirmation Alert'])[1]"));
     comfalert.click();
     driver.switchTo().alert().accept();
     
     WebElement promalert = driver.findElement(By.xpath("(//button[normalize-space()='Prompt Alert'])[1]"));
     promalert.click();
     driver.switchTo().alert().sendKeys("Harry Potter");
     driver.switchTo().alert().accept();
     }
     
     // New Tab
    // WebElement tab = driver.findElement(By.xpath("//button[normalize-space()='New Tab']"));
    // tab.click();
     
     // Mouse hover
     @Test
     public void mousehover() throws InterruptedException {

    	    WebElement moveover = driver.findElement(By.className("dropbtn"));

    	    Actions act = new Actions(driver);
    	    act.moveToElement(moveover).perform(); // hover first

    	    Thread.sleep(2000);

    	    WebElement over = driver.findElement(By.linkText("Mobiles"));
    	    over.click();
    	}

     @Test
     // double click 
     public void doublclick() throws InterruptedException {
    	WebElement  doubclick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
    	doubclick.click();
    	doubclick.click();
    	Thread.sleep(4000);
    	WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
    	System.out.println(box1.getText());
    	WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
    	System.out.println(box2.getText());
    	
     }
     // slider 
     @Test
     public void slider() throws InterruptedException {
    	 Thread.sleep(2000);
    	 Actions act = new Actions(driver);
    	WebElement slid1 = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
        WebElement slid2 = driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));
    	act.dragAndDropBy(slid1, 80, 0).click().perform();
    	act.dragAndDropBy(slid2, -90, 0).click().perform();
    	
    	
     }
     // drag and drop 
     
     public void dragdrop() throws InterruptedException {
    	 Thread.sleep(3000);
    	 Actions act = new Actions(driver);
    	WebElement drag = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
    	WebElement drop =  driver.findElement(By.xpath("//div[@id='droppable']"));
    	act.dragAndDrop(drag, drop).perform();
     }
     //table
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
    	    	
    	    	//Scrolling1
    	    	 @Test
    	    	    public void Scrolling1() throws InterruptedException {
    	    	    	driver.findElement(By.xpath("//input[@id='comboBox']")).click();
    	    	    	Thread.sleep(3000);
    	    	    
    	    	    
    	    	      	WebElement option = driver.findElement(By.xpath("//input[@id='comboBox']"));
    	    	    	Actions act = new Actions(driver);
    	    	    	act.moveToElement(option).click().perform();
    	    	    	driver.findElement(By.xpath("//div[normalize-space()='Item 54']")).click();
    	    	    	
    	    	    	
    	    	    }
    	    	 
    	    	 //link
    	    	 @Test
    	    	 public void link() {
    	    		WebElement link = driver.findElement(By.xpath("(//a[normalize-space()='Apple'])[1]"));
    	    		link.click();
    	    		driver.navigate().back();
    	    		
    	    		WebElement link2 = driver.findElement(By.xpath("(//a[normalize-space()='Dell'])[1]"));
    	    		link2.click();
    	    		driver.navigate().back();
    	    	 }
    	    	 
    	    	 //download
    	    	 
    	    	 @Test
    	    	    public void download() throws InterruptedException {
    	    	    	driver.findElement(By.xpath("//a[normalize-space()='Download Files']")).click();
    	    	    	Thread.sleep(5000);
    	    	    	
    	    	    	WebElement text = driver.findElement(By.xpath("//textarea[@id='inputText']"));
    	    	    	text.sendKeys("singh ");
    	    	    	driver.findElement(By.xpath("//button[@id='generateTxt']")).click();
    	    	    	Thread.sleep(2000);
    	    	    	driver.findElement(By.xpath("//a[@id='txtDownloadLink']")).click();
    	    	    	Thread.sleep(2000);
    	    	    	driver.findElement(By.xpath("//button[@id='generatePdf']")).click();
    	    	    	Thread.sleep(2000);
    	    	    	driver.findElement(By.xpath("//a[@id='pdfDownloadLink']")).click();
    	    	    	Thread.sleep(2000);

    	    	    	driver.findElement(By.xpath("//button[normalize-space()='Download PDF File']")).click();
    	    	    	driver.navigate().back();
    	    	    	
    	    	    	driver.findElement(By.xpath("(//a[@class='home-link'])[1]")).click();
    	    	    	
    	    	    	
    	    	    	
    	    	    	driver.navigate().refresh();
    	    	    	
    	    	    }
    	    	 
    	    	 //uploadfile 
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
    public void Aftertest() {
        System.out.println("Test Has been Completed");
       driver.quit();
    }
}


   