package smoketest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class smoketestjunit {

    @Test
    public void smokeTest() {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Testing Practice";

        assertEquals(expectedTitle, actualTitle, "Page title does not match");
       // assert(boolean) fail("I have filed the command annomnesly to check it is running or not");
        //driver.quit();
        System.out.println("Runing the code");
        
    }
    @BeforeAll
    public static void smokeTestBefore() {
    	System.out.println("Run Before Test");
    }
    @AfterAll
    public static void smokeTestafter() {
    	System.out.println("After the test run this");
    }
}
