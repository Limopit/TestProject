package gitProject.tests.testsWithoutLoginPage;

import gitProject.pages.MainPage;
import org.testng.annotations.Test;

public class TestTeam extends BaseTest {

    @Test
    public static void teamTest(){
        MainPage.testTeam();
    }
}
