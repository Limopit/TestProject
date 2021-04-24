
package gitProject.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private final static Logger LOG = LogManager.getRootLogger();
    private static WebDriver driver = singDriver();

    private Driver() {
    }

    public static WebDriver singDriver() {
        return (driver == null) ? driver = initFirefoxDriver() : driver;
    }

    private static WebDriver initFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        LOG.info("Driver initialization");
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        return driver;
    }



}
