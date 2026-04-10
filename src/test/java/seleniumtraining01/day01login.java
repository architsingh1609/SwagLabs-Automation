package seleniumtraining01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("Archit singh");
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("architsingh1609@gmail.com");
		System.out.println("Printed Succesfully");
		String title = driver.getTitle();
		System.out.println("Titile of the page is " + title);
		/*if (title.equals("Automation Testing Practice")) {
            System.out.println("Good to go");
        } else {
            System.out.println("Cancel or quit the page");
        }

       // driver.quit();
    }
}*/
		System.out.println("title of the page is " + title);
	}
}

