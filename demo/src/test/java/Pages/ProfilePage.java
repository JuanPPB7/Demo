package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private final WebDriver driver;
    private final By contentWrapperBy = By.xpath("//div[@class='content_wrapper flex']//a");

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }
    public String getContentWrapper(){
        return driver.findElement(contentWrapperBy).getText();
    }

}
