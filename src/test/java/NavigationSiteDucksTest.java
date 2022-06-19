import objectsiteducks.Browsers;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import objectsiteducks.NavigationSiteDucks;

import java.time.Duration;

public class NavigationSiteDucksTest extends TestBase {

    @Test
    public void loadingOpenSiteDucksTest() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }

    @Test
    public void clickRubberDucksTest() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickRubberDucks();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store1");
    }

    @Test
    public void clickDeliveryInformationTest() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickDeliveryInformation();
        Assert.assertEquals(driver.getTitle(), "Delivery Information | My Store1");
    }

    @Test
    public void clickTermsConditionsTest() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickTermsConditions();
        Assert.assertEquals(driver.getTitle(), "Terms & Conditions | My Store1");
    }

    @Test
    public void clickDiscountsPromotions() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickDiscountsPromotions();
        Assert.assertEquals(driver.getTitle(), "4 | My Store1");
    }

    @Test
    public void clickSubcategory() {
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
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store1");
    }

    @Test
    public void clickButtonHome() {
        Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));
        switch (browser) {
            case chrome: driver = new ChromeDriver(); break;
            case firefox: driver = new FirefoxDriver(); break;
        }
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        NavigationSiteDucks navigationSiteDucks = new NavigationSiteDucks(driver);
        navigationSiteDucks.clickButtonHome();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store1");
    }
}
