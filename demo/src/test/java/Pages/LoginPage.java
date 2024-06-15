package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private final WebDriver driver;
    private final By usernameTextboxBy = By.id("username");
    private final By passwordTextboxBy = By.id("password");
    private final By loginButtonBy = By.id("login_button");
    private static final Logger log = LogManager.getLogger(LoginPage.class);



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage typingUsername(String username){
        log.debug("Typing username...");
        driver.findElement(usernameTextboxBy).sendKeys(username);
        return new LoginPage(driver);
    }
    public LoginPage typingPassword (String password){
        driver.findElement(passwordTextboxBy).sendKeys(password);
        return new LoginPage(driver);
    }
    public void clickLoginButton() {
        driver.findElement(loginButtonBy).click();
        new ProfilePage(driver);
    }
}
