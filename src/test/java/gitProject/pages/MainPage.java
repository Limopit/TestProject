package gitProject.pages;

import io.qameta.allure.Step;

import static gitProject.locator.Locators.*;

public class MainPage extends BasePage{

    @Step("testing marketplace button")
    public static void testMarketplace(){
        initElement(MARKET).click();
        waiting(2);
        initElement(TABLE).isDisplayed();
    }

    @Step("testing team button")
    public static void testTeam(){
        initElement(TEAM).click();
        waiting(2);
        initElement(TEAMTEXT).isDisplayed();
    }

    @Step("testing enterprice button")
    public static void testEnterprice(){
        initElement(ENTERPRICE).click();
        waiting(2);
        initElement(GITENTERPRICE).isDisplayed();
    }

    @Step("testing search ability")
    public static void testSearch(){
        initElement(SEARCH).sendKeys("Limopit/TestProject");
        initElement(SEARCHBUTTON).click();
        waiting(2);
        initElement(FINDREPOSITORY).isDisplayed();
    }
}
