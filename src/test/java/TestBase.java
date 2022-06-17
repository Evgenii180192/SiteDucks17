import objectsiteducks.helpers.ScreenshotListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();

    }

   @AfterMethod
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
