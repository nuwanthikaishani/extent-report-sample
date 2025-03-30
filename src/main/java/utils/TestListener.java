package utils;

import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test succeeded: " + result.getName());
    }

//    @Override
//    public void onTestFailure(ITestResult result) {
//        System.out.println("Test failed: " + result.getName());
//    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Optional: Implement if needed
    }

//    @Override
//    public void onStart(ITestContext context) {
//        // Optional: Implement if needed
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        // Optional: Implement if needed
    }
//    @Override
//    public void onTestFailure(ITestResult result){
//
//        String screenshotPath = ScreenshotUtil.takeScreenshot(driver, result.getName());
//        test.log(Status.FAIL, "Test Failed. Screenshot: " + screenshotPath);
//
//    }
