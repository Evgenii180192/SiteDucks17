import objectsiteducks.InputSearch;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputSearchTest extends TestBase {

    @Test
    public void checkInputSearchTest() {
    InputSearch inputSearch = new InputSearch(driver);
    inputSearch.inputSearchField();
    Assert.assertEquals(driver.getTitle(), "Purple Duck | Rubber Ducks | My Store1");
    }
}
