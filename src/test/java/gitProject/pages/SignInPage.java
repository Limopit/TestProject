package gitProject.pages;

import io.qameta.allure.Step;
import org.testng.Assert;
import static gitProject.locator.Locators.*;

public class SignInPage extends BasePage {

    public static void login(String username){
        BasePage.initElement(LOGIN).sendKeys(username);
    }

    public static void password(String password){
        BasePage.initElement(PASSWORD).sendKeys(password);
    }

    public static void signIn(){
        BasePage.initElement(SIGN_IN_BUTTON).click();
    }

    public static void enter(){
        BasePage.initElement(ENTER).click();
    }

    @Step("Testing creating ability")
    public static void create(){
        initElement(CREATE).click();
        Assert.assertTrue(BasePage.URLtest().equals("https://github.com/join?source=login"));
    }

    @Step("Entering and testing")
    public static void enter_and_test(String username, String password){
        login(username);
        password(password);
        enter();
        waiting(2);
        LoggedPage.testLogin(username);

    }

    @Step("Entering")
    public static void enter(String username, String password){
        login(username);
        password(password);
        enter();
    }

    @Step ("False entering test")
    public static void falseTest(){
       Assert.assertFalse(BasePage.URLtest().equals("https://github.com/"));
    }

    @Step("Testing forgot password button")
    public static void forgot(){
        initElement(FORGOT).click();
        Assert.assertTrue(BasePage.initElement(RESET).getText().equals("Reset your password"));
    }
}
