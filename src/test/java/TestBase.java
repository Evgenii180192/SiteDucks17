import objectsiteducks.helpers.Browsers;
import objectsiteducks.helpers.ScreenshotListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import java.time.Duration;

import static objectsiteducks.helpers.Browsers.chrome;
import static objectsiteducks.helpers.Browsers.firefox;

@Listeners(ScreenshotListener.class)
public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        if (driver == null) {
            Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
            switch (browser) {
                case chrome: {
                    driver = new ChromeDriver();
                    break;
                }
                case firefox: {
                    driver = new FirefoxDriver();
                    break;
                }
            }
            driver.get("https://litecart.stqa.ru/en/");
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        }
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
