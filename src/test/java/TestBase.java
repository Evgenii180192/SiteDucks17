import objectsiteducks.helpers.ScreenshotListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public class TestBase {

    WebDriver driver;

   @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
