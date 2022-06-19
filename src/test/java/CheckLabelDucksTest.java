import objectsiteducks.Browsers;
import objectsiteducks.NavigationSiteDucks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckLabelDucksTest extends TestBase {
    @Test
    public void checkLabelYellowDuck() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickSubcategory();
        String labelTextYellowDuck =
                driver.findElement(By.xpath("//div[@class=\"sticker sale\"][contains(text(), 'Sale')]")).getText();
        System.out.println(labelTextYellowDuck);
        Assert.assertEquals(labelTextYellowDuck, "SALE");
    }

    @Test
    public void checkLabelGreenDuck() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickSubcategory();
        String labelTextGreenDuck = driver.findElement(By.xpath("//div[@title=\"New\"]")).getText();
        System.out.println(labelTextGreenDuck);
        Assert.assertEquals(labelTextGreenDuck, "NEW");
    }
}
