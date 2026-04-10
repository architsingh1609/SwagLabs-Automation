package pagetesing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pagetestingvalues {

    WebDriver driver;

    // Constructor
    public pagetestingvalues(WebDriver driver) {
        this.driver = driver;
    }

    // Name
    public void namevalues(String name) {
        driver.findElement(By.id("name")).sendKeys(name);
    }

    // Email
    public void emailvalues(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    // Phone Number
    public void phonenumber(String phone) {
        driver.findElement(By.id("phone")).sendKeys(phone);
    }

    // Address
    public void address(String address) {
        driver.findElement(By.id("textarea")).sendKeys(address);
    }
}

