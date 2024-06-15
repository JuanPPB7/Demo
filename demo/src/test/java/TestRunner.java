import Pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestRunner extends Hooks {
    private static final Logger log = LogManager.getLogger(TestRunner.class);


    @Test
    public void SuccessfulLogin(){

        Data data = null;

        String username = Data.getUsername();
        String password = Data.getPassword();

        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        homePage.clickOnLoginButton()
                .typingUsername(username)
                .typingPassword(password)
                .clickLoginButton();
        assertEquals(profilePage.getContentWrapper(), username);
    }
}
