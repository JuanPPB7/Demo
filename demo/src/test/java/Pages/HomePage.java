package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {
    private final WebDriver driver;
    private final By loginBy = By.xpath("//div[@class='flex']//a[@href='/login']");
    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickOnLoginButton(){
        log.debug("Clicking on login button...");
        driver.findElement(loginBy).click();
        return new LoginPage(driver);
    }
}
