package gitProject.tests.testsWithoutLoginPage;

import gitProject.pages.MainPage;
import org.testng.annotations.Test;

public class TestMarketplace extends BaseTest {

    @Test
    public static void marketplaceTest(){
        MainPage.testMarketplace();
    }
}
