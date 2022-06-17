import objectsiteducks.AdditionalButtonSite;
import org.testng.annotations.Test;

public class CheckAdditionalButtonSiteTest extends TestBase {

    @Test
    public void clickButtonScroll() {
        AdditionalButtonSite additionalButtonSite = new AdditionalButtonSite(driver);
        additionalButtonSite.checkButtonScroll();
    }

}
