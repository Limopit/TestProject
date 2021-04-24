package gitProject.pages;

import gitProject.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriverWait wait;

    protected static WebElement initElement(By by) {
        return Driver.singDriver().findElement(by);
    }

    @Step("Entering the login page")
    public static void loginPage(){
        Driver.singDriver().get("https://github.com/login");
    }

    @Step("Entering the site")
    public static void site(){
        Driver.singDriver().get("https://github.com/");
    }

    @Step("Closing driver")
    public static void closeDriver() {
        if(Driver.singDriver() != null) {
            Driver.singDriver().quit();
        }
    }

    protected static WebDriverWait waiting(int sec){
        return wait = new WebDriverWait(Driver.singDriver(),sec);
    }

    public static String URLtest(){
        return Driver.singDriver().getCurrentUrl();
    }
}
