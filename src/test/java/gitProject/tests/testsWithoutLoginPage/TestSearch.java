package gitProject.tests.testsWithoutLoginPage;

import gitProject.pages.MainPage;
import org.testng.annotations.Test;

public class TestSearch extends BaseTest {

    @Test
    public static void searchTest(){
        MainPage.testSearch();
    }
}
