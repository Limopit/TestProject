package gitProject.tests.testsWithoutLoginPage;

import gitProject.pages.MainPage;
import org.testng.annotations.Test;

public class TestEnterprice extends BaseTest {

    @Test
    public static void enterpriceTest(){
        MainPage.testEnterprice();
    }
}
