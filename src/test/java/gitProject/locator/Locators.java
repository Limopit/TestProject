package gitProject.locator;

import org.openqa.selenium.By;

public class Locators {
    public static By SIGN_IN_BUTTON = By.cssSelector("a.HeaderMenu-link:nth-child(2)");
    public static By LOGIN = By.cssSelector("#login_field");
    public static By PASSWORD = By.cssSelector("#password");
    public static By ENTER = By.cssSelector(".btn");
    public static By CREATE = By.cssSelector(".login-callout > a:nth-child(1)");
    public static By DROP_DOWN = By.cssSelector(".js-feature-preview-indicator-container > summary:nth-child(1)");
    public static By PROFILE = By.cssSelector(".js-feature-preview-indicator-container > details-menu:nth-child(2) > a:nth-child(5)");
    public static By REP = By.cssSelector("#dashboard-repos-container > div:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(3)");
    public static By REPTEST = By.cssSelector("strong.mr-2 > a:nth-child(1)");
    public static By NAME = By.cssSelector(".p-nickname");
    public static By HELP = By.cssSelector("a.dropdown-item:nth-child(14)");
    public static By FORGOT = By.cssSelector(".label-link");
    public static By RESET = By.cssSelector(".auth-form-header > h1:nth-child(1)");
    public static By TABLE = By.cssSelector("nav.d-none");
    public static By MARKET = By.cssSelector("li.border-bottom:nth-child(5) > a:nth-child(1)");
    public static By TEAM = By.cssSelector("li.border-bottom:nth-child(2) > a:nth-child(1)");
    public static By TEAMTEXT = By.cssSelector(".h0-mktg-fluid");
    public static By ENTERPRICE = By.cssSelector("li.border-bottom:nth-child(3) > a:nth-child(1)");
    public static By GITENTERPRICE = By.cssSelector("h4.h5-mktg-fluid:nth-child(1)");
    public static By SEARCH = By.cssSelector("input.form-control");
    public static By FINDREPOSITORY = By.cssSelector(".repo-list-item");
    public static By SEARCHBUTTON = By.cssSelector("#jump-to-suggestion-search-global > a:nth-child(1)");
}
