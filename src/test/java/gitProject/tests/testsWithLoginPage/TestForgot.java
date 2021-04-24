package gitProject.tests.testsWithLoginPage;

import gitProject.pages.SignInPage;
import org.testng.annotations.Test;

public class TestForgot extends BaseTest {

    @Test
    public static void forgotTest(){
        SignInPage.forgot();
    }
}
