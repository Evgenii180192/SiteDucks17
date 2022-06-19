import objectsiteducks.ButtonScroll;
import org.testng.annotations.Test;

public class CheckButtonScrollTest extends TestBase {
    @Test
    public void clickButtonScroll() {
        ButtonScroll buttonScroll = new ButtonScroll(driver);
        buttonScroll.clickButtonScroll();
    }
}
