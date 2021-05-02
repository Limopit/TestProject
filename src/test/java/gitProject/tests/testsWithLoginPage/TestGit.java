package gitProject.tests.testsWithLoginPage;

import gitProject.pages.SignInPage;
import org.testng.annotations.Test;

public class TestGit extends BaseTest {

    @Test
    public static void gitTest(){
        SignInPage.enter_and_test("username","password");

    }

}
