package gitProject.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import static gitProject.locator.Locators.*;

public class LoggedPage extends BasePage {

    @Step("Repository testing")
    public static void rep(){
        waiting(2);
        String text = BasePage.initElement(REP).getText();
        initElement(REP).click();
        Assert.assertTrue(BasePage.initElement(REPTEST).getText().equals(text));
    }

    @Step("Testing login")
    protected static void testLogin(String username){
        initElement(DROP_DOWN).click();
        waiting(2);
        initElement(PROFILE).click();
        Assert.assertTrue(BasePage.initElement(NAME).getText().equals(username));
    }

    @Step("Testing help page")
    public static void help(){
        initElement(DROP_DOWN).click();
        waiting(2);
        initElement(HELP).click();
        waiting(2);
        URLtest().equals("https://docs.github.com/en");
    }
}
