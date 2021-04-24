package gitProject.tests.testsWithLoginPage;

import gitProject.pages.SignInPage;
import org.testng.annotations.Test;

public class TestCreating extends BaseTest {

    @Test
    public static void creatingTest(){
        SignInPage.create();
    }

}
