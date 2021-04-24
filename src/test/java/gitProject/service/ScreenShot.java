package gitProject.service;

import gitProject.driver.Driver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenShot(){
        return ((TakesScreenshot) Driver.singDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
