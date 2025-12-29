package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;
import utility.ScreenshotUtil;

public class Listener extends TestBase implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed: " + result.getName());

        if (driver != null) {
            ScreenshotUtil.takeScreenshot(driver, result.getName());
        }
    }
}