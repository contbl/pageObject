package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage(String url) {
        driver.get(url);
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("email")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.name("senha")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.tagName("button")).click();
    }
}