package seleniumtraining01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class logingtest {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");

        enterText(By.id("name"), "Archit Singh");
        enterText(By.id("email"), "architsingh1609@gmail.com");
        enterText(By.id("phone"), "9140480213");
        enterText(By.id("textarea"), "India");

        clickElement(By.id("male"));
        clickElement(By.id("sunday"));

        selectDropdown(By.id("country"), "Canada");

        System.out.println("✅ Form filled successfully");
        
        driver.quit();
    }

    // -------- Utility Methods --------

    static void enterText(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    static void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    static void selectDropdown(By locator, String visibleText) {
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(visibleText);
        
    }
}
