package gitProject.tests.testsWithLoginPage;

import gitProject.driver.ITListener;
import gitProject.pages.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ITListener.class)

public class BaseTest {

    @BeforeTest
    public static void init(){
        BasePage.loginPage();
    }

    @AfterTest
    public static void close(){
        BasePage.closeDriver();
    }
}
