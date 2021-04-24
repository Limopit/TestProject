package gitProject.tests.testsWithLoginPage;

import gitProject.pages.SignInPage;
import org.testng.annotations.Test;

public class TestUnsuccessfulGit extends BaseTest {

    @Test
    public static void unsuccessfulTest(){
        SignInPage.enter("Limoit","Jeep0600");
        SignInPage.falseTest();
    }
}
