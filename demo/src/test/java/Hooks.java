import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    protected WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/jburgos/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.themoviedb.org/");
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
