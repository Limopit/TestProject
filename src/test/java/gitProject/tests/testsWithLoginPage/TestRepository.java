package gitProject.tests.testsWithLoginPage;

import gitProject.pages.SignInPage;
import gitProject.pages.LoggedPage;
import org.testng.annotations.Test;


public class TestRepository extends BaseTest {

    @Test
    public static void repositoryTest(){
        SignInPage.enter("username","password");
        LoggedPage.rep();
    }

}
