package gitProject.driver;

import gitProject.service.ScreenShot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ITListener implements org.testng.ITestListener {
    private final static Logger LOG = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult result) {
        LOG.info(result.getName() + " Starting");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    LOG.info(result.getName() + " Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShot.saveScreenShot();
        LOG.info(result.getName() + " Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOG.info(result.getName() + " Test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        LOG.info(context.getName() + " Test started");
    }

    @Override
    public void onFinish(ITestContext context) {
        LOG.info(context.getName() + " Test finished");
    }
}
