package gitProject.tests.testsWithLoginPage;

import gitProject.pages.SignInPage;
import gitProject.pages.LoggedPage;
import org.testng.annotations.Test;

public class TestHelp extends BaseTest {

    @Test
    public static void helpTest(){
        SignInPage.enter("username","password");
        LoggedPage.help();
    }
}
